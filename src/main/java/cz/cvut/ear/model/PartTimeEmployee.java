package cz.cvut.ear.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Part-time")
public class PartTimeEmployee extends Employee {
    @Column(nullable = false)
    private Integer hourlyRate;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(Employee employee) {
        setName(employee.getName());
        setSurname(employee.getSurname());
        setUsername(employee.getUsername());
        setEmail(employee.getEmail());
        setRole(employee.getRole());
        setUserTasks(employee.getUserTasks());
        setUserProjects(employee.getUserProjects());
    }


    // getters and setters

    public Integer getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Integer hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
