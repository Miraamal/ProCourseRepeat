//package org.example._28_05_24.task;
//
//import java.util.Scanner;
//
//public class Loop {
//    public static void main(String[] args) {
//        int a = 0;
//        while (a < 1000) {
//            System.out.println("I am not  repeatable");
//            a++;
//        }
//
//        int b = 0;
//        while (b <= 100) {
//            System.out.println(b);
//            b++;
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number:");
//        int userNum = sc.nextInt();
//        sc.nextLine();
//        int c = 0;
//        while (c <= userNum) { // ili dlinneye versiya c%2=0
//            System.out.println(c);
//            c = c + 2; // dlya vivoda chetnogo chisla
//        }
//
//        String userStr = null;
//        while (!"quit".equals(userStr)) { // poka vvedennaya polzovatelem stroka ne ravna/ekvivalentna quit
//            System.out.println("Enter quit for exit");
//            userStr = sc.nextLine();
//        }
//
////        int d = 0;
////        while (true) {
////            System.out.println("When this will be over?");
////        }
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//        Scanner scr = new Scanner(System.in);
//        System.out.println("Enter number");
//        int num1 = scr.nextInt();
//        System.out.println("Enter second number");
//        int num2 = scr.nextInt();
//        int sum  = 0;
//        //int min = Cycle.min(num1,num2);
//        //int max = Cycle.max(num1,num2);
//        //for (int i = min; i <= max; i++) {
//            sum = sum + i; //sum += i
//        }
//        System.out.println(sum);
//
//        for (char i = 'b'; i <= 'z' ; i+=2) {
//            System.out.println(i);
//        }
//    }
//
//}
