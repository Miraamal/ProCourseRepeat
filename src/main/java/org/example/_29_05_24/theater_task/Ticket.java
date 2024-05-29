package org.example._29_05_24.theater_task;

public class Ticket {
    private String ticketName;
    private String userInfo;
    private double schedule;
    private String hallInfo;

    public Ticket(String ticketName, String userInfo, double schedule, String hallInfo) {
        this.ticketName = ticketName;
        this.userInfo = userInfo;
        this.schedule = schedule;
        this.hallInfo = hallInfo;
    }

    public String getTicketName() {
        return this.ticketName;
    }

    public String getUserInfo() {
        return this.userInfo;
    }

    public double getSchedule() {
        return this.schedule;
    }

    public String getHallInfo() {
        return this.hallInfo;
    }
}
