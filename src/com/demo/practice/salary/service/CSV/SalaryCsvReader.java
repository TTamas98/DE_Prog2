package com.demo.practice.salary.service.CSV;

import com.demo.practice.salary.domain.SalaryInformation;

import java.util.List;

public interface SalaryCsvReader {

    List<SalaryInformation> readSalariesFromCSV();
    void writeSalaryInformationToFile(List<SalaryInformation> salaryInformationList);
    void writeSalaryInformationToFile(SalaryInformation salaryInformation);
}
