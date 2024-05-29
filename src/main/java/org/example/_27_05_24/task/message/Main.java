package org.example._27_05_24.task.message;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        EmailMessage mail1 = new EmailMessage("hello", "John","hello",
                "same","copy","same copy");
        EmailMessage mail2 = new EmailMessage("hello", "John","hello",
                "same","copy","same copy");
        // ChatMessage chatMessage = new ChatMessage("hi");

        System.out.println(mail1==mail2);
        System.out.println(mail1.equals(mail2));
        // System.out.println(chatMessage.getStatus());

    }
}
