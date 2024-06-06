package org.example._29_05_24.theater_task.model.cinema;

import org.example._29_05_24.theater_task.model.film.Movie;
import org.example._29_05_24.theater_task.model.user.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Session {
    private static long count = 0;
    protected long id;
    private Movie film;
    private LocalDateTime dateTime;
    private List<Ticket> tickets;

    public Session(Movie film, LocalDateTime dateTime, int ticketsQuantity, String hallName) {
        this.id = count++;
        this.film = film;
        this.dateTime = dateTime;
        for (int i = 1; i <= ticketsQuantity ; i++) {
           Ticket ticket = new Ticket(this, hallName, i );
           tickets.add(ticket);
        }
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFilm(Movie film) {
        this.film = film;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }



    public long getId() {
        return id;
    }

    public Movie getFilm() {
        return film;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public List<Ticket> getTickets() {
        return new ArrayList<>(tickets);
    }

    public Ticket buyTicket(int seatNumber, User user){
       Ticket ticket = tickets.get(seatNumber-1);
       ticket.setUser(user);
       tickets.remove(ticket);
       return ticket;
    }

}
