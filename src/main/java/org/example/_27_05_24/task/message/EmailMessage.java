package org.example._27_05_24.task.message;

import java.util.Objects;

public class EmailMessage extends Message{
    private final String topic;
    private final String copy;
    private final String hiddenCopy;

    public EmailMessage(String text, String receiver, String sender,
                        String topic, String copy, String hiddenCopy) {
        super(text, receiver, sender);
        this.topic = topic;
        this.copy = copy;
        this.hiddenCopy = hiddenCopy;
    }

    public String getTopic() {
        return topic;
    }

    public String getCopy() {
        return copy;
    }

    public String getHiddenCopy() {
        return hiddenCopy;
    }

    @Override
    public String toString() {
        return "EmailMessage{" +
                "topic='" + topic + '\'' +
                ", copy='" + copy + '\'' +
                ", hiddenCopy='" + hiddenCopy + '\'' +
                super.toString()+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EmailMessage that = (EmailMessage) o;

        if (!Objects.equals(topic, that.topic)) return false;
        if (!Objects.equals(copy, that.copy)) return false;
        return Objects.equals(hiddenCopy, that.hiddenCopy);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (topic != null ? topic.hashCode() : 0);
        result = 31 * result + (copy != null ? copy.hashCode() : 0);
        result = 31 * result + (hiddenCopy != null ? hiddenCopy.hashCode() : 0);
        return result;
    }
}
