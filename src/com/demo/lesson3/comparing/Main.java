package com.demo.lesson3.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FavouriteNumber fav1 = new FavouriteNumber(3);
        FavouriteNumber fav2 = new FavouriteNumber(31);
        FavouriteNumber fav3 = new FavouriteNumber(5);
        FavouriteNumber fav4 = new FavouriteNumber(13);
        FavouriteNumber fav5 = new FavouriteNumber(15);
        FavouriteNumber fav6 = new FavouriteNumber(33);

        List<FavouriteNumber> favouriteNumberList = new ArrayList<>(List.of(
                fav1, fav2, fav3, fav4, fav5, fav6
        ));

        printFavNumberList(favouriteNumberList);
        Collections.sort(favouriteNumberList);
        System.out.println("\n----------------------------");
        printFavNumberList(favouriteNumberList);

        List<FavouriteNumber> favouriteNumberList2 = new ArrayList<>(List.of(
                fav3, fav2, fav2, fav6, fav5, fav4
        ));

        System.out.println("\n----------------------------");
        printFavNumberList(favouriteNumberList2);
        favouriteNumberList2.sort(new FavouriteNumberComparator());
        System.out.println("\n----------------------------");
        printFavNumberList(favouriteNumberList2);
    }

    private static void printFavNumberList(List<FavouriteNumber> favouriteNumberList) {
        for(FavouriteNumber favouriteNumber: favouriteNumberList) {
            System.out.println(favouriteNumber.getFavouriteNumber());
        }
    }
}
