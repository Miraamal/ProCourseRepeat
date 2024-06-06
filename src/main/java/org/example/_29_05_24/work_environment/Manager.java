package org.example._29_05_24.work_environment;

/*
Дополнительное поле:
subordinatesCount (int) - количество подчиненных.
Конструктор для всех полей (включая поля базового класса).
Переопределение метода toString() для добавления информации о количестве подчиненных.
Переопределение метода calculateBonus(), где бонус увеличивается на 2% за каждого подчиненного.


 */
public class Manager extends Employee {
    private int subordinatesCount;

    public Manager(String name, String position, double salary, int subordinatesCount) {
        super(name, position, salary);
        this.subordinatesCount = subordinatesCount;
    }

    @Override
    public double calculateBonus() {
        double salary = super.getSalary();
        double salaryBonus = salary * 0.02 * subordinatesCount;
        return salaryBonus;

    }

    @Override
    public String toString() {
        return "Manager{" +
                "subordinatesCount=" + subordinatesCount +
                '}';
    }
}
