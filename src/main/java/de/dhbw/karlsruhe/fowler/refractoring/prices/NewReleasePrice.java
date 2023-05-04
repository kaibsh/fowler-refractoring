package de.dhbw.karlsruhe.fowler.refractoring.prices;

import de.dhbw.karlsruhe.fowler.refractoring.Movie;
import de.dhbw.karlsruhe.fowler.refractoring.Price;

public class NewReleasePrice implements Price {

    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getCharge(final int daysRented){
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(final int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
