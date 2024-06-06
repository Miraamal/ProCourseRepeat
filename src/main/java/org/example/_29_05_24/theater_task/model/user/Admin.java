package org.example._29_05_24.theater_task.model.user;

public class Admin extends UserImpl {


    public Admin(String name) {
        super(name, Role.ADMIN);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
