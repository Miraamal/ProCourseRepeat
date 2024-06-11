package org.example._29_05_24.theater_task.model.user;

public class Viewer extends UserImpl {


    public Viewer(String name) {
        super(name, Role.VIEWER);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Viewer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role=" + role + //"hashcode = " + hashCode()
                '}';
    }
}
