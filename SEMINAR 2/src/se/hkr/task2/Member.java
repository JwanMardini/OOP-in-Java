package se.hkr.task2;

public class Member {
    public enum Role {
        MEMBER, ADMINISTRATOR, OWNER, COACH
    }

    private String name;
    private Role role;

    public Member(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

