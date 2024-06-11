package org.example._29_05_24.theater_task;

import org.example._29_05_24.theater_task.model.cinema.Ticket;
import org.example._29_05_24.theater_task.model.film.ActionFilm;
import org.example._29_05_24.theater_task.model.film.Movie;
import org.example._29_05_24.theater_task.model.user.Admin;
import org.example._29_05_24.theater_task.model.user.User;
import org.example._29_05_24.theater_task.model.user.Viewer;
import org.example._29_05_24.theater_task.service.SessionService;
import org.example._29_05_24.theater_task.service.UserService;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    private static UserService userService= new UserService();
    private static User admin = new Admin("Vasya");
    private static User viewer = new Viewer("Misha");
    private static SessionService sessionService = new SessionService();
    private static Scanner scr = new Scanner(System.in);
    public static void main(String[] args) {
        start();
        System.out.println("Enter your user name:");
        String username = scr.nextLine();
        User user = userService.getUserByName(username);
        if (user==null) {
            System.out.println("User ne nayden");
            return;
        }
        System.out.println("Viberite deystvie: delete session, create session, buy ticket, show actual sessions");
        String userChoice = scr.nextLine();
        switch (userChoice){
            case "delete session" -> {
                System.out.println(sessionService.getSessions());
                System.out.println("Vvedite ID udalaemogo seansa");
                long sessionId = scr.nextLong();
                scr.nextLine();
                sessionService.removeSession(sessionId,user);
                System.out.println("seans udalen");
                System.out.println(sessionService.getSessions());

            }
            case "create session" -> {
                System.out.println("Enter movie name");
                String movieName = scr.nextLine();
                Movie film = new ActionFilm(movieName);
                // vvod dati i vremeni propusheni dlya prostoti
                LocalDateTime localDateTime = LocalDateTime.of(2024,7,7,17,50);
                sessionService.createSession(film,localDateTime,100,user,"Red");
                System.out.println("seans sozdan");
                System.out.println(sessionService.getSessions());
            }
            case "buy ticket" -> {
                System.out.println(sessionService.getSessions());
                System.out.println("Vvedite id seansa");
                long id = scr.nextLong();
                Ticket ticket = sessionService.buyTicket(user, id, 10);
                System.out.println(ticket);
            }
        }
    }

    private static void start(){
        userService.addUser(admin);
        userService.addUser(viewer);
        sessionService.createSession(new ActionFilm("Rembo2"),
                LocalDateTime.now().plusDays(1),100,admin,"black");

    }
}
