package org.example._10_06_24;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scr = new Scanner(Path.of("Names.txt"));
        String names = scr.nextLine();
        System.out.println(names);
        List<String> list = List.of(names.split(","));
        System.out.println(list);
        //Set<String> uniqueNames = HashSet.newHashSet(list);

//        System.out.println(uniqueNames);
//        System.out.println(list.size()) - uniqueNames.size();

        Patient patient1 = new Patient("Misha","Mishkin", LocalDate.of(1984,4,7));
        Patient patient2 = new Patient("Max","Maxim", LocalDate.of(1996,7,16));
        Patient patient3 = new Patient("Nadia","Zuhri", LocalDate.of(1996,7,16));
        Patient patient4 = new Patient("Zulya","Maxim", LocalDate.of(1996,7,16));
        // Set<Patient> uniqueNames1 = new HashSet<>();
//        uniqueNames1.add(patient1);
//        uniqueNames1.add(patient2);
//        uniqueNames1.add(patient3);
        //System.out.println(uniqueNames1.size());

    }
}
