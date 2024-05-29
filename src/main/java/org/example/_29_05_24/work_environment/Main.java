package org.example._29_05_24.work_environment;
/*
Обработка массивов
В методе main создать массив Employee[], который будет содержать объекты Manager и Developer.
Использовать простой цикл (for или foreach), чтобы вывести информацию о каждом сотруднике и его бонусе.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] array = {new Manager("John","Project Manager",
                5500, 100),
                new Developer("George", "CEO", 8000, "Java")
        };
        for (Employee e :array){
            System.out.println("Employee: " + e + " : Bonus: " + e.calculateBonus() );

        }

    }
}
