package org.example._24_05_24.task;

import java.util.Arrays;
import java.util.Random;

/*
Написать класс, который будет отвечать за решение задачи
Задача есть массив чисел
нужно сформировать новый массив чисел
в котором все нули будут в конце
при этом порядок остальных элементов не будет нарушен
Декомпозиция:
1. Задание массива
1.1 Сформировать через Random'a
2. Само решение *
3. Вывод решения
3.1 в терминал
4. Рассмотреть разные сценарии
ПЯТЬ человек
кто-то должен создать репозиторий
форкнуть репу
* Тесты
 */
public class ArrayRandom {
    public static void main(String[] args) {

        int[] array = getRandomNumbers(18);
        System.out.println(Arrays.toString(array));
        int[] result = moveZeros(array);
        System.out.println(Arrays.toString(moveZeros(result)));
    }

    public static int[] getRandomNumbers(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * 9);
        }
        return array;
    }

    public static int[] moveZeros(int[] array) {

        int[] dublicateArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                dublicateArray[count] = array[i];
                count++;
            }
        }
        return dublicateArray;
    }


}
