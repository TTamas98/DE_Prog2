package com.demo.lesson3.comparing;

import java.util.Comparator;

public class FavouriteNumberComparator implements Comparator<FavouriteNumber> {

    @Override
    public int compare(FavouriteNumber o1, FavouriteNumber o2) {
        return o1.getFavouriteNumber() - o2.getFavouriteNumber();
    }

}
