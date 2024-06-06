package org.example._29_05_24;

import java.util.Random;
import java.util.Scanner;

public class Nonna {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Show me temperature");
        int a = scr.nextInt();
        if (a < 0) {
            System.out.println("Put hat on");
        }
        if (a > 25) {
            System.out.println("Put panama");
        } else {
            System.out.println("Have a good day!");
        }
        System.out.println("Come to Nonna for dinner");

        // zadacha

        int x = scr.nextInt();
        System.out.println("Enter first number");
        int y = scr.nextInt();
        System.out.println("Enter second number");
        if (x <= 0) {
            System.out.println("Show on screen");
        } else {
            if (y > 0) {
                int sum = x + y;
                if (sum % 2 == 0) sum++;
                System.out.println(sum);
            }
        }
        if (x <= 0 && y <= 0) {
            int mult = x * y;
            if (mult < 0)
                mult = mult * mult;   //mult *= mult;
            System.out.println(mult);
        }

        // zadacha
        Random rnd = new Random();
        int b = rnd.nextInt(11);
        int c = rnd.nextInt(11);

        System.out.println(b);
        System.out.println(c);
        if (b > c) System.out.println(b);
        else System.out.println(c);

        System.out.println(b >= c ? b : c);
        System.out.println(Math.max(b, c));

        int d = rnd.nextInt(11);
        int max = b > c ? (b > d ? b : d) : (c > d ? c : d);
        System.out.println(max);
        max = b>c ? (Math.max(b,d)) : (Math.max(c,d));
    }

}
