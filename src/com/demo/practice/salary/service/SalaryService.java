package com.demo.practice.salary.service;

import com.demo.practice.salary.domain.SalaryInformation;

import java.util.List;
import java.util.Map;

public interface SalaryService {

    String findDepartmentNameWithHighestBaseSalaryForMales();
    List<SalaryInformation> findSalaryInformationForTheGivenGenderInTheGivenDepartment(String department, char gender);
    Map<String, Double> calculateAverageSalaryForDepartments();
    String findTheNameOfTheDepartmentThatPaysTheMostForAdministration();
    SalaryInformation findHighestBaseSalary();
    Map<Character, Long> getHighestSalaryForGenders();
    String findDivisionWithHighestSalaryInCaseOfPolice();
    String findDepartmentNameWithHighestSalaryInCaseOfAdministrations();
}
