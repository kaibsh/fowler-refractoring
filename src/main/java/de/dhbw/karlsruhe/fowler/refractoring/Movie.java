package de.dhbw.karlsruhe.fowler.refractoring;

import de.dhbw.karlsruhe.fowler.refractoring.prices.ChildrensPrice;
import de.dhbw.karlsruhe.fowler.refractoring.prices.NewReleasePrice;
import de.dhbw.karlsruhe.fowler.refractoring.prices.RegularPrice;

public class Movie {

    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    private final String title;
    private Price price;

    public Movie(final String title, final int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle (){
        return this.title;
    }

    public double getCharge(final int daysRented) {
        return this.price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(final int daysRented) {
        return this.price.getFrequentRenterPoints(daysRented);
    }

    public void setPriceCode(final int priceCode) {
        switch (priceCode) {
            case REGULAR -> price = new RegularPrice();
            case CHILDRENS -> price = new ChildrensPrice();
            case NEW_RELEASE -> price = new NewReleasePrice();
            default -> throw new IllegalArgumentException("The gives price code doesn't exist!");
        }
    }
}