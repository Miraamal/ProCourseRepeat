package org.example._29_05_24.theater_task.model.film;

public class ComedyFilm extends Movie{

    public ComedyFilm(String title) {
        super(title, Genre.COMEDY);
    }

    @Override
    public void show() {
        System.out.println("Make everybody laugh");
    }
}
