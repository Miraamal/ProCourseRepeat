package org.example._29_05_24.theater_task.model.film;
/*
Создать несколько классов, реализующих интерфейс Film,
для разных жанров (например, ActionFilm, ComedyFilm, DramaFilm).
 */
public class ActionFilm extends Movie{


    public ActionFilm(String title) {
        super(title, Genre.ACTION);
    }

    @Override
    public void show() {
        System.out.println("Make me tense");
    }
}
