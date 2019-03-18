package Model;

import java.util.Objects;

public class employee {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public employee(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        Role = role;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof employee)) return false;
        employee employee = (employee) o;
        return firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName) &&
                Role.equals(employee.Role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, Role);
    }

    private String firstName;
    private String lastName;
    private String Role;
}
