package com.demo.practice.salary.service.provider;

import com.demo.practice.salary.domain.SalaryInformation;
import com.demo.practice.salary.service.CSV.SalaryCsvReader;

import java.util.ServiceLoader;
import java.util.List;

public class SalaryListProvider implements ServiceLoader.Provider<List<SalaryInformation>> {

    private final SalaryCsvReader reader = null;

    @Override
    public Class<? extends List<SalaryInformation>> type() {
        return null;
    }

    @Override
    public List<SalaryInformation> get() {
        return reader.readSalariesFromCSV();
    }
}
