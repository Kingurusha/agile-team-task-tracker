package cz.cvut.ear.model;

import cz.cvut.ear.model.enums.SprintStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Sprint extends AbstractEntity {
    @Column(unique = true, nullable = false)
    private String sprintName;

    @Column(nullable = false)
    private LocalDateTime startDateTime;
    @Column(nullable = false)
    private LocalDateTime endDateTime;

    @OneToMany(mappedBy = "sprint")
    private List<Task> tasksInSprint;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SprintStatus sprintStatus;

    public Sprint() {
    }

    @Override
    public String toString() {
        return "Sprint{" +
                "sprintName='" + sprintName + '\'' +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                ", tasksInSprint=" + tasksInSprint +
                ", sprintStatus=" + sprintStatus +
                '}';
    }


    // getters and setters

    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
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

    public List<Task> getTasksInSprint() {
        return tasksInSprint;
    }

    public void setTasksInSprint(List<Task> tasksInSprint) {
        this.tasksInSprint = tasksInSprint;
    }

    public SprintStatus getSprintStatus() {
        return sprintStatus;
    }

    public void setSprintStatus(SprintStatus sprintStatus) {
        this.sprintStatus = sprintStatus;
    }
}
