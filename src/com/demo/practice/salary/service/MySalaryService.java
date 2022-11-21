package com.demo.practice.salary.service;

import com.demo.practice.salary.domain.SalaryInformation;
import com.demo.practice.salary.service.provider.SalaryListProvider;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MySalaryService implements SalaryService {

    private final SalaryListProvider salaryListProvider = new SalaryListProvider();

    @Override
    public String findDepartmentNameWithHighestBaseSalaryForMales() {
        return salaryListProvider.get().stream()
                .filter(salaryInformation -> salaryInformation.getGender() == 'M')
                .max(Comparator.comparingLong(SalaryInformation::getBaseSalary))
                .orElseThrow(RuntimeException::new).getDepartmentName();
    }

    @Override
    public List<SalaryInformation> findSalaryInformationForTheGivenGenderInTheGivenDepartment(String department, char gender) {
        return salaryListProvider.get().stream()
                .filter(salaryInformation -> isAppropriateSalaryInformation(salaryInformation, department, gender))
                .collect(Collectors.toList());
    }

    private boolean isAppropriateSalaryInformation(SalaryInformation salaryInformation, String department, char gender) {
        return salaryInformation.getGender() == gender && salaryInformation.getDepartment().equals(department);
    }

    @Override
    public Map<String, Double> calculateAverageSalaryForDepartments() {
        return salaryListProvider.get().stream()
                .collect(Collectors.groupingBy(SalaryInformation::getDepartmentName, Collectors.averagingLong(SalaryInformation::getBaseSalary)));
    }

    @Override
    public String findTheNameOfTheDepartmentThatPaysTheMostForAdministration() {
        return salaryListProvider.get().stream()
                .filter(salaryInformation -> salaryInformation.getDivision().equals("Administration"))
                .max(Comparator.comparingLong(SalaryInformation::getBaseSalary))
                .orElseThrow(RuntimeException::new).getDepartmentName();
    }

    @Override
    public SalaryInformation findHighestBaseSalary() {
        return salaryListProvider.get().stream()
                .max(Comparator.comparingLong(SalaryInformation::getBaseSalary))
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public Map<Character, Optional<SalaryInformation>> getHighestSalaryForGenders() {
        return salaryListProvider.get().stream()
                .collect(Collectors.groupingBy(SalaryInformation::getGender, Collectors.maxBy(Comparator.comparingLong(SalaryInformation::getBaseSalary))));
    }

    @Override
    public String findDivisionWithHighestSalaryInCaseOfPolice() {
        return salaryListProvider.get().stream()
                .filter(salaryInformation -> salaryInformation.getDepartmentName().equals("Department of Police"))
                .max(Comparator.comparingLong(SalaryInformation::getBaseSalary))
                .orElseThrow(RuntimeException::new).getDivision();
    }

}
