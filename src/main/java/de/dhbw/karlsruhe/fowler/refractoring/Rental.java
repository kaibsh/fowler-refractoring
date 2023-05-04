package de.dhbw.karlsruhe.fowler.refractoring;

class Rental {

    private final Movie movie;
    private final int daysRented;

    public Rental(final Movie movie, final int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public int getDaysRented() {
        return this.daysRented;
    }

    public double getCharge() {
        return this.movie.getCharge(this.daysRented);
    }

    public int getFrequentRenterPoints() {
        return this.movie.getFrequentRenterPoints(this.daysRented);
    }
}