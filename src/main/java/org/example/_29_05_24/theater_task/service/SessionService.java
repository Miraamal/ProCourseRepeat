package org.example._29_05_24.theater_task.service;

import org.example._29_05_24.theater_task.model.cinema.Session;
import org.example._29_05_24.theater_task.model.cinema.Ticket;
import org.example._29_05_24.theater_task.model.film.Movie;
import org.example._29_05_24.theater_task.model.user.Role;
import org.example._29_05_24.theater_task.model.user.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SessionService  {
    private final Map<Long,Session>idToSession;


    public SessionService() {
        this.idToSession = new HashMap<>();
    }

    public Session createSession(Movie film, LocalDateTime dateTime, int ticketsQuantity, User user, String hallName) {
        checkRole(user);
        Session session = new Session(film, dateTime,ticketsQuantity, hallName);
        idToSession.put(session.getId(),session);
        return session;
    }

    public Session editSession(long id, Movie film, LocalDateTime dateTime, User user) {
        checkRole(user);
        if (!idToSession.containsKey(id)) throw new IllegalArgumentException("Cant find session by ID= " + id);
        Session session = idToSession.get(id);
        if (film != null) session.setFilm(film);
        if (dateTime != null) session.setDateTime(dateTime);

        return session;
    }

    public void removeSession(long id, User user) {
        checkRole(user);
        if (!idToSession.containsKey(id)) throw new IllegalArgumentException("Cant find session by ID= " + idToSession);
        idToSession.remove(id);
    }
    private void checkRole(User user){
        if (user.getRole()!= Role.ADMIN) throw new IllegalArgumentException("Must be admin only!");
    }

    public List<Session> getSessions(){
        List<Session>actualSessions = new ArrayList<>();
        for (Session s : idToSession.values()) {
            if (s.getDateTime().isAfter(LocalDateTime.now()))actualSessions.add(s);
        }
        return actualSessions;
    }
    public Ticket buyTicket(User user, long sessionId, int seatNumber){
        Session session = getSession(sessionId);
        return session.buyTicket(seatNumber, user);

    }
    public Session getSession (long id){
        if (!idToSession.containsKey(id))throw new IllegalArgumentException("Cant find session by ID= " + id);
        return  idToSession.get(id);
    }

}
