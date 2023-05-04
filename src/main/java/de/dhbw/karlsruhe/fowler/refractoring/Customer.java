package de.dhbw.karlsruhe.fowler.refractoring;

import java.lang.*;
import java.util.*;

public class Customer {

    private final String name;
    private final List<Rental> rentals = new ArrayList<>();

    public Customer(final String name){
        this.name = name;
    }

    public void addRental(final Rental rental) {
        this.rentals.add(rental);
    }

    public String statement() {
        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rental Record for ").append(this.name).append("\n");
        stringBuilder.append("\t").append("Title").append("\t").append("\t").append("Days").append("\t").append("Amount").append("\n");


        for (final Rental rental : this.rentals) {
            stringBuilder.append("\t").append(rental.getMovie().getTitle()).append("\t").append("\t").append(rental.getDaysRented()).append("\t").append("\t").append(String.valueOf(rental.getCharge())).append("\n");
        }

        stringBuilder.append("Amount owed is ").append(String.valueOf(getTotalCharge())).append("\n");
        stringBuilder.append("You earned ").append(String.valueOf(getTotalFrequentRenterPoints())).append(" frequent renter points");

        return stringBuilder.toString();
    }

    public double getTotalCharge() {
        double result = 0;
        for (final Rental rental : this.rentals) {
            result += rental.getCharge();
        }
        return result;
    }

    public int getTotalFrequentRenterPoints(){
        int result = 0;
        for (final Rental rental : this.rentals) {
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }
}
    