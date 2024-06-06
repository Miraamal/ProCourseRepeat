package org.example._29_05_24.theater_task.model.film;

public abstract class Movie implements Film {

    private static long count = 0;
    protected String title;
    protected long id;
    protected Genre genre;

    public Movie(String title, Genre genre) {
        this.id = count++;
        this.title = title;
        this.genre = genre;
    }
    public long getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public Genre getGenre() {
        return this.genre;
    }

    public abstract void show();
}
