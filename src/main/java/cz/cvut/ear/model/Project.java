package cz.cvut.ear.model;

import cz.cvut.ear.model.enums.ProjectStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
public class Project extends AbstractEntity {
    private String projectName;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private ProjectStatus projectStatus;
    @ManyToMany(mappedBy = "userProjects")
    private Set<User> usersInProject;

    @OneToMany(mappedBy = "project")
    private List<Task> tasksInProject;

//    private List<Sprint> sprintsInProject;
    private String description;

    public Project() {
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

    public Set<User> getUsersInProject() {
        return usersInProject;
    }

    public void setUsersInProject(Set<User> usersInProject) {
        this.usersInProject = usersInProject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
