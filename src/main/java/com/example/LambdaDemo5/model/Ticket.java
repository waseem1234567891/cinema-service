package com.example.LambdaDemo5.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class Ticket {
    private String movieName;
    private int price;
    private String cinemaName;

    public String getMovieName() {
        return movieName;
    }

    public Ticket() {
    }

    public Ticket(String movieName, int price, String cinemaName) {
        this.movieName = movieName;
        this.price = price;
        this.cinemaName = cinemaName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public int getPrice() {
        return price;
    }

    public String getCinemaName() {
        return cinemaName;
    }
}
