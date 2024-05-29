package org.example._28_05_24.task;

import java.util.Scanner;

public class Wrapps {
    public static void main(String[] args) {
       // System.out.println((int)'1'); // chto za kod u simbola 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cod of symbols:");
        int code = sc.nextInt();
        char symbol = (char)code;
        System.out.println(symbol);
        System.out.println(Character.getName(code));
        if (Character.isLetter(symbol)){
            System.out.println("Symbol is a letter");
            System.out.println(Character.isUpperCase(symbol)? "Capital letter":"Linear"); // ternarniy operator
        } else {
            if (Character.isDigit(symbol)){
                System.out.println("Symbol is a digit");

            } else {
                if (Character.isWhitespace(symbol)){
                    System.out.println("Symbol is a whitespace");
                }
            }
        }

    }
}
