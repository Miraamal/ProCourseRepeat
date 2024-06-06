package org.example._29_05_24.theater_task.model.film;

public class DramaFilm extends Movie{

    public DramaFilm(String title) {
        super(title, Genre.DRAMA);
    }

    @Override
    public void show() {
        System.out.println("Make everyone cry");
    }
}
