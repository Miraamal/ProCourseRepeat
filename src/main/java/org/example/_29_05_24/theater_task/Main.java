package org.example._29_05_24.theater_task;

import org.example._29_05_24.theater_task.model.film.*;
import org.example._29_05_24.theater_task.service.SessionService;

public class Main {
    public static void main(String[] args) {
        Movie movie = new ComedyFilm("American pie");
        Movie movie1 = new DramaFilm("Kill Bill");
        Movie movie2 = new ActionFilm("Terminator");

        // Session session = new Session("Sex and the city",  );

        SessionService sessionService = new SessionService();



        Film[] films = {movie, movie1, movie2};
        for (Film f : films) {

            System.out.println(f.getTitle()  + " " + f.getGenre());
        }
    }

}
