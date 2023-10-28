package cz.cvut.ear.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Full-time")
public class FullTimeEmployee extends Employee {
    @Column(nullable = false)
    private Integer salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(Employee employee) {
        setName(employee.getName());
        setSurname(employee.getSurname());
        setUsername(employee.getUsername());
        setEmail(employee.getEmail());
        setRole(employee.getRole());
        setUserTasks(employee.getUserTasks());
        setUserProjects(employee.getUserProjects());
    }

    // getters and setters

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
