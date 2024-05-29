package org.example._29_05_24.theater_task;

public abstract class Movie implements Film {
    protected String title;
    protected String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getGenre() {
        return this.genre;
    }

}
