package com.demo.lesson4.exercises.ford_escort;

import java.util.Objects;

public class Ford implements Comparable<Ford> {

    private final int year;
    private final int milage;
    private final long price;

    public Ford(int year, int milage, long price) {
        this.year = year;
        this.milage = milage;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return year == ford.year && milage == ford.milage && price == ford.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, milage, price);
    }

    public int getYear() {
        return year;
    }

    public int getMilage() {
        return milage;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public int compareTo(Ford o) {
        if(o.getYear() == this.year) {
            return o.getMilage() - this.milage;
        }
        return o.getYear() - this.year;
    }
}
