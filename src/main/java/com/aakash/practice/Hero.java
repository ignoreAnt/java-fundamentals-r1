package com.aakash.practice;

public class Hero {
    private String name;
    private String fees;
    private String movie;

    public Hero(String movie, String fees, String name) {
        this.movie = movie;
        this.fees = fees;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void describe() {
        System.out.println(this.name + " charges " + this.fees + " for movie " + this.movie);
    }
}
