package cz.cvut.ear.model;

import cz.cvut.ear.model.enums.UserRole;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "AGILE_USER")
public class User extends AbstractEntity {
    private String name;
    private String surname;
    private String username;
    private String email;
    private UserRole role;

    @OneToMany(mappedBy = "assignee")
    private List<Task> userTasks;
    @ManyToMany
    @JoinTable(
            name = "USER_PROJECT",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "PROJECT_ID")
    )
    private Set<Project> userProjects;


    public User() {
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
