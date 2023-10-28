package cz.cvut.ear.model;

import cz.cvut.ear.model.enums.SprintStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Sprint extends AbstractEntity {
    private String sprintName;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    @OneToMany(mappedBy = "sprint")
    private List<Task> tasksInSprint;
    private SprintStatus sprintStatus;

    public Sprint() {
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
