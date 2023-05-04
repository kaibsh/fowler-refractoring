package de.dhbw.karlsruhe.fowler.refractoring.prices;

import de.dhbw.karlsruhe.fowler.refractoring.Movie;
import de.dhbw.karlsruhe.fowler.refractoring.Price;

public class RegularPrice implements Price {

    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getCharge(final int daysRented){
        if (daysRented > 2) {
            return 2 + (daysRented - 2) * 1.5;
        }
        return 2;
    }

    @Override
    public int getFrequentRenterPoints(final int daysRented) {
        return 1;
    }
}
