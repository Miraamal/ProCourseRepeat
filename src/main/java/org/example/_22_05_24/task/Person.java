package org.example._22_05_24.task;
/*
Создать метод createPerson, принимающий параметры String personName и int personAge.
Метод должен добавлять имя и возраст в соответствующие массивы.
Проверить, что текущий индекс не превышает размер массива.
Если превышает, метод должен завершаться без добавления нового человека.
 */

/*
Создать метод getPersonById, который принимает int id и
возвращает массив из двух элементов: имя и возраст (String[]).
Если ID не существует (меньше нуля или больше текущего индекса),
возвращать массив с значениями по умолчанию: {"empty", "-1"}.

 */

import java.util.Arrays;

/*
Создать метод printPersonById, который принимает int id и выводит в консоль имя и
возраст человека с данным ID.
Если ID не существует, метод ничего не выводит.
 */

/*
Добавить метод удаления человека по id.
public void removePersonById(int id){…}

Добавить метод удаления человека, если в качестве формального аргумента
будет передаваться экземпляр типа Person
public void remove(Person person){…}

 */


public class Person {
    String[] names = new String[10];
    int[] ages = new int[10];
    int currentIndex = 0;

    public void createPerson(String personName, int personAge) {
        if (currentIndex < 10) {
            names[currentIndex] = personName;
            ages[currentIndex] = personAge;
            currentIndex++;
        }
    }

    public String[] getPersonById(int id) {
        String[] info = {"empty", "-1"};
        if (id >= 0 && id < 10) {
            info[0] = names[id];
            info[1] = String.valueOf(ages[id]);
            return info;
        }
        return info;
    }

    public void printPerson(int id) {
        if (id >= 0 && id < 10) {
            System.out.println(Arrays.toString(getPersonById(id)));
        }

    }

    public void removePersonById(int id) {
        if (id >= 0 && id < currentIndex) {
            names[id] = null;
            ages[id] = 0;
        }


        }

//    public void remove(Person person){
//
//    }
    public static void main(String[] args) {
        Person person = new Person();
        person.removePersonById(5);
    }
    }

