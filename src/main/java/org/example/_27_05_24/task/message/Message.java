package org.example._27_05_24.task.message;

import java.util.Objects;

public class Message {
    private final String text;
    private final String receiver;
    private final String sender;

    public String getText() {
        return text;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSender() {
        return sender;
    }

    public Message(String text, String receiver, String sender) {
        this.text = text;
        this.receiver = receiver;
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", receiver='" + receiver + '\'' +
                ", sender='" + sender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (!Objects.equals(text, message.text)) return false;
        if (!Objects.equals(receiver, message.receiver)) return false;
        return Objects.equals(sender, message.sender);
    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
        result = 31 * result + (receiver != null ? receiver.hashCode() : 0);
        result = 31 * result + (sender != null ? sender.hashCode() : 0);
        return result;
    }
}
