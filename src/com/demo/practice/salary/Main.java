package com.demo.practice.salary;

import com.demo.practice.salary.service.MySalaryService;
import com.demo.practice.salary.service.SalaryService;
import com.demo.practice.salary.service.provider.SalaryListProvider;

public class Main {
    public static void main(String[] args) {
        SalaryService salaryService = new MySalaryService();
        SalaryListProvider salaryListProvider = new SalaryListProvider();
        System.out.println(salaryListProvider.get());
        System.out.println(salaryService.calculateAverageSalaryForDepartments());
    }
}
