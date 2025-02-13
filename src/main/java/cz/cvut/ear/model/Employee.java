package cz.cvut.ear.model;

import cz.cvut.ear.model.enums.UserRole;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "AGILE_USER/EMPLOYEE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "EMP_TYPE")
public abstract class Employee extends AbstractEntity {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surname;
    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private UserRole role; // = level access

    @OneToMany(mappedBy = "assignee")
    private List<Task> userTasks;

    @ManyToMany
    @JoinTable(
            name = "USER_PROJECT",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "PROJECT_ID")
    )
    private Set<Project> userProjects;


    public Employee() {
    }


    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public List<Task> getUserTasks() {
        return userTasks;
    }

    public void setUserTasks(List<Task> userTasks) {
        this.userTasks = userTasks;
    }

    public Set<Project> getUserProjects() {
        return userProjects;
    }

    public void setUserProjects(Set<Project> userProjects) {
        this.userProjects = userProjects;
    }
}
