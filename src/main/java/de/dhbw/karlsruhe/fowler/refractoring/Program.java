package de.dhbw.karlsruhe.fowler.refractoring;

import java.lang.*;
import java.util.*;

public class Program {
    
    public static void main(final String[] args) {
        System.out.println("Welcome to the Movie Store!");

        final Movie firstMovie = new Movie("1. Movie", 1);
        final Movie secondMovie = new Movie("2. Movie", 2);

        final Rental firstRental = new Rental(firstMovie, 10);
        final Rental secondRental = new Rental(secondMovie, 5);

        final Customer customer = new Customer("Joe");
        customer.addRental(firstRental);
        customer.addRental(secondRental);

        System.out.println("Let's get the Statement:");
        System.out.println(customer.statement());
    }
}


