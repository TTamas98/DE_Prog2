package com.demo.lesson3.comparing;

public class FavouriteNumber implements Comparable<FavouriteNumber> {

    int favouriteNumber;

    public FavouriteNumber(int favouriteNumber) {
        this.favouriteNumber = favouriteNumber;
    }

    public int getFavouriteNumber() {
        return favouriteNumber;
    }

    @Override
    public int compareTo(FavouriteNumber o) {
        return this.favouriteNumber - o.getFavouriteNumber();
    }
}
