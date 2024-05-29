package org.example._24_05_24.task;

import java.util.Random;
import java.util.Scanner;

public class ScanRand {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner scr = new Scanner(System.in);
        int age = scr.nextInt();

        Random rnd = new Random();
        int compVariant = rnd.nextInt(121);
        System.out.println("Programm made a mistake in " + (age - compVariant) + "age");
    }
}
