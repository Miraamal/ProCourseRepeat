package org.example._27_05_24.task.message;

import java.time.LocalDate;
import java.util.Objects;
import java.util.PrimitiveIterator;

public class ChatMessage extends Message{
    private final LocalDate date;
    private Status status;

    public ChatMessage(String text, String receiver, String sender) {
        super(text, receiver, sender);
        this.date = LocalDate.now();
        this.status = Status.SENT;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "date=" + date +
                ", status=" + status +
                super.toString()+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ChatMessage that = (ChatMessage) o;

        if (!Objects.equals(date, that.date)) return false;
        return status == that.status;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
