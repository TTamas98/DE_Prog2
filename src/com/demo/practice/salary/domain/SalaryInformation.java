package com.demo.practice.salary.domain;

import java.util.Objects;

public class SalaryInformation {

    private String department;
    private String departmentName;
    private String division;
    private char gender;
    private Double baseSalary;
    private String grade;

    public SalaryInformation() {
    }

    public SalaryInformation(String department, String departmentName, String division, char gender, Double baseSalary, String grade) {
        this.department = department;
        this.departmentName = departmentName;
        this.division = division;
        this.gender = gender;
        this.baseSalary = baseSalary;
        this.grade = grade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalaryInformation that = (SalaryInformation) o;
        return gender == that.gender && Objects.equals(department, that.department) && Objects.equals(departmentName, that.departmentName) && Objects.equals(division, that.division) && Objects.equals(baseSalary, that.baseSalary) && Objects.equals(grade, that.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, departmentName, division, gender, baseSalary, grade);
    }

    @Override
    public String toString() {
        return "SalaryInformation{" +
                "department='" + department + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", division='" + division + '\'' +
                ", gender=" + gender +
                ", baseSalary=" + baseSalary +
                ", grade=" + grade +
                '}';
    }
}
