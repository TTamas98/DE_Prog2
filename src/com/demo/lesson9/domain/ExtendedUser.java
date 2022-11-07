package com.demo.lesson9.domain;

import java.util.Objects;

public class ExtendedUser extends User {

    private final int age;
    private final String state;
    private final Gender gender;
    private final Long balance;

    public ExtendedUser(long id, String username, String firstName, String lastName, String email, int age, String state, Gender gender, Long balance) {
        super(id, username, firstName, lastName, email);
        this.age = age;
        this.state = state;
        this.gender = gender;
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    public String getState() {
        return state;
    }

    public Gender getGender() {
        return gender;
    }

    public Long getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ExtendedUser that = (ExtendedUser) o;
        return age == that.age && Objects.equals(state, that.state) && gender == that.gender && Objects.equals(balance, that.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), age, state, gender, balance);
    }

    @Override
    public String toString() {
        return "ExtendedUser{" +
                "age=" + age +
                ", state='" + state + '\'' +
                ", gender=" + gender +
                ", balance=" + balance +
                '}';
    }
}
