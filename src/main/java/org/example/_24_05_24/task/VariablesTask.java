package org.example._24_05_24.task;

public class VariablesTask {
    public static void main(String[] args) {
        int abc = 345;
        int a = abc / 100; //poluchim 3 otkinem ostatok
        int b = (abc / 10) % 10;
        int c = abc % 10;
        System.out.println("Number" + abc + "->" + a + "," + b + "," + c);

        int def = 987;
        int d = def / 100;
        int e = (def / 10) % 10;
        int f = def % 10;
        System.out.println("Number" + def + "->" + d + "," + e + "," + f);

        // zadacha iz bolshego v menshee, obertki primitivnix tipov

        long num1 = Long.MIN_VALUE; // klass obertka
        long num2 = 0;
        long num3 = 100;
        long num4 = Long.MAX_VALUE; // klass obertka

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println();

        int i1 = (int) num1;  // yavnoe privedeni polojili int v long, to est bolshee v menshee
        int i2 = (int) num2;
        int i3 = (int) num3;
        int i4 = (int) num4;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        //zadacha

        double salary = 137;
        double price = 2.4;
        int count_sausage = (int) (salary / price);
        double change = (salary - count_sausage * price);
        int dollars = (int) change;
        int cents = ((int) (change * 100)) % 100;

        System.out.printf("Billi bought %d packs, took %d USD, left %d cents\n", count_sausage, dollars, cents);

        String text = "500";
        int num = Integer.parseInt(text);
        num = num*2;
        System.out.printf("%d and one night",num);

    }

}
