package cz.cvut.ear.model;

import cz.cvut.ear.model.enums.TaskStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
public class Task extends AbstractEntity {
    @Column(nullable = false)
    private String taskName;
    private Integer storyPoints;

    @ManyToMany
    @JoinTable(
            name = "TASK_LABEL",
            joinColumns = @JoinColumn(name = "TASK_ID"),
            inverseJoinColumns = @JoinColumn(name = "LABEL_ID")
    )
    private Set<Label> labels;
    @Column(nullable = false)
    private TaskStatus taskStatus;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User assignee;

    @ManyToMany
    @JoinTable(
            name = "TASK_PARTIC",
            joinColumns = @JoinColumn(name = "TASK_ID"),
            inverseJoinColumns = @JoinColumn(name = "USER_ID")
    )
    private List<User> participants;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdateDate;
    @ManyToOne
    @JoinColumn(name = "SPRINT_ID")
    private Sprint sprint;
    @ManyToOne
    @JoinColumn(name = "PROJECT_ID")
    private Project project;
    private String description;


    public Task() {
    }

    // getters and setters

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Integer getStoryPoints() {
        return storyPoints;
    }

    public void setStoryPoints(Integer storyPoints) {
        this.storyPoints = storyPoints;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
