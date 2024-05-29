package org.example._29_05_24.work_environment;
/*
Класс Employee (реализует EmployeeInterface)
Поля:
name (String)
position (String)
salary (double)
Конструктор для всех полей.
Геттеры и сеттеры для каждого поля.
Метод toString() для вывода базовой информации о сотруднике.
Метод calculateBonus(), который возвращает 5% от зарплаты.
 */
public class Employee implements EmployeeInterface {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculateBonus() {
        return this.salary*0.05;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
