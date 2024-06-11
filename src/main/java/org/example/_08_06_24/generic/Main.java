package org.example._08_06_24.generic;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pair<String,Integer> pair1 = new Pair<>("first", 1);
        Pair<Double, LocalDate> pair2 = new Pair<>(1.1, LocalDate.now());
        System.out.println(pair1);
        System.out.println(pair2);
        String one = pair1.getFirst();

        String s1 = null;
        String s2 = "Hi";
        String s3 = "Bye";

        System.out.println(getNotNullOrDefault(s1, s2));
        System.out.println(getNotNullOrDefault(s3, s2));

        Integer num1 = null;
        Integer num2 = 2;
        Integer num3 = 5;
        System.out.println(getNotNullOrDefault(num1, num2));
        System.out.println(getNotNullOrDefault(num3, num2));

    }

    /**
     * proverit znachenie na null ili vernut znachenie po umolchaniyu
     * @param value proveraemiy obyekt
     * @param defaultValue znachenie po umolchaniyu
     * @return obyekt ili znachenie po umolchaniyu
     * @param <T> tip obyekta
     */
    public static  <T> T  getNotNullOrDefault(T value, T defaultValue){
        return value == null ? defaultValue:value;  // ternarniy operator
    }

    public static <A,B,C> C getThird (A valueA, B valueB, C valueC ){
        return (valueA != null && valueB != null) ? valueC : null;
    }
}
