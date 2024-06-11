package org.example._29_05_24.theater_task.model.cinema;

import org.example._29_05_24.theater_task.model.user.User;

public class Ticket {
    private static long count = 0;
    private final long id;
    private User user;
    private final Session session;
    private final String hallName;
    private final int seatNumber;

    public Ticket( Session session, String hallName, int seatNumber) {
        this.id = count++;
        this.session = session;
        this.hallName = hallName;
        this.seatNumber = seatNumber;
    }

    public static long getCount() {
        return count;
    }

    public long getId() {
        return id;
    }



    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public Session getSession() {
        return session;
    }

    public String getHallName() {
        return hallName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", user=" + user +
                ", hallName='" + hallName + '\'' +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
