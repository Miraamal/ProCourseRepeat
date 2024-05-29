package org.example._22_05_24.task_2;

public class Start {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6,};
        Start start = new Start();
        System.out.println(start.getSum(array));
        // System.out.println(new Start().getSum(array)); mojno i tak srazu sozdat obyekt
    }

    public int add(int[] array) {
        int tempNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                tempNum += array[i];

            }
        }
        return tempNum;
    }

    public int getSum(int[] array) {
        int result = 0;
        int middle = 0;
        for (int i = 0; i < array.length / 2; i++) {
            result = result + array[i] + array[array.length - 1 - i];
        }
        if (array.length % 2 != 0) {
            result += array[array.length / 2];
        }
        return result;
    }


}
