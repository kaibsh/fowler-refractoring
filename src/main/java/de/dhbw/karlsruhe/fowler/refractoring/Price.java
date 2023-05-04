package de.dhbw.karlsruhe.fowler.refractoring;

public interface Price {

    int getPriceCode();

    double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented);
}
