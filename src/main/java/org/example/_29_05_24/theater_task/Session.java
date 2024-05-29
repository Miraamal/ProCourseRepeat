package org.example._29_05_24.theater_task;

public class Session {
    private String movieTitle;
    private double time;
    private int ticketsQuantity;

    public Session(String movieTitle, double time, int ticketsQuantity) {
        this.movieTitle = movieTitle;
        this.time = time;
        this.ticketsQuantity = ticketsQuantity;
    }

    public String getMovieTitle() {
        return this.movieTitle;
    }

    public double getTime() {
        return this.time;
    }

    public int getTicketsQuantity() {
        return this.ticketsQuantity;
    }
}
