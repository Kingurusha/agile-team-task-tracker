package cz.cvut.ear.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Label extends AbstractEntity {
    @Column(unique = true, nullable = false)
    private String labelName;

    @Override
    public String toString() {
        return "Label{" +
                "labelName='" + labelName + '\'' +
                '}';
    }

    // getters and setters

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }
}
