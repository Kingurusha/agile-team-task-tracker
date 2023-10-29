package cz.cvut.ear.model;

import cz.cvut.ear.model.enums.ProjectStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Project extends AbstractEntity {
    @Column(nullable = false, unique = true)
    private String projectName;

    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProjectStatus projectStatus;

    @ManyToMany(mappedBy = "userProjects")
    private Set<Employee> usersInProject;

    @OneToMany(mappedBy = "project")
    private Set<Task> tasksInProject;

    private String description;

    public Project() {
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectName='" + projectName + '\'' +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                ", projectStatus=" + projectStatus +
                ", usersInProject=" + usersInProject +
                ", tasksInProject=" + tasksInProject +
                ", description='" + description + '\'' +
                '}';
    }

    // getters and setters

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public ProjectStatus getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(ProjectStatus projectStatus) {
        this.projectStatus = projectStatus;
    }

    public Set<Employee> getUsersInProject() {
        return usersInProject;
    }

    public void setUsersInProject(Set<Employee> usersInProject) {
        this.usersInProject = usersInProject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Task> getTasksInProject() {
        return tasksInProject;
    }

    public void setTasksInProject(Set<Task> tasksInProject) {
        this.tasksInProject = tasksInProject;
    }
}
