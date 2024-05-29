package org.example._29_05_24.theater_task;

public abstract class Employees implements User{
    protected String name;
    protected String role;

    public Employees(String name, String role) {
        this.name = name;
        this.role = role;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getRole() {
        return this.role;
    }
}
