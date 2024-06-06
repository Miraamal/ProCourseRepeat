package org.example._29_05_24.theater_task.model.user;

public abstract class UserImpl implements User{
    private static long count = 0;

    protected long id;
    protected String name;
    protected Role role;

    public UserImpl(String name, Role role) {
        this.id = count++;
        this.name = name;
        this.role = role;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Role getRole() {
        return role;
    }
}
