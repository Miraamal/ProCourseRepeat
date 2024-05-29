package org.example._24_05_24.task;

import java.util.Random;

public class RandomTask {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = rnd.nextInt(0, 60);
        int hour = 9;
        System.out.printf("Moves from station A at %02d:%02d\n", hour, n);
        int t = n + 12;
        n = t % 60;
        hour = hour + t / 60;
        System.out.printf("Moves from station B at %02d:%02d\n", hour, n);
        t = n + 17;
        n = t % 60;
        hour = hour + t / 60;
        System.out.printf("Moves from station C at %02d:%02d\n", hour, n);
        t = n + 22;
        n = t % 60;
        hour = hour + t / 60;
        System.out.printf("Moves from station D at %02d:%02d\n", hour, n);


    }

}
