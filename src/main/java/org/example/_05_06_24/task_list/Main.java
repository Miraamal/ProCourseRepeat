package org.example._05_06_24.task_list;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 5;
        int num3 = 3;
        int num4 = 9;
        int num5 = 7;

        List<Integer> list = List.of(1,5,3,9,7);
        System.out.println(list.contains(3));


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
        list.forEach(integer -> System.out.println(integer)); // funkcionalniy vid zapisi
        list.forEach(System.out::println); // samiy korotkiy metod napisaniya-lambda virajenie
        System.out.println(list);
        System.out.println(list.subList(0,3));


        System.out.println(list);


    }

}
