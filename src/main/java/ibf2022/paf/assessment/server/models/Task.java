package ibf2022.paf.assessment.server.models;

import java.sql.Date;

// TODO: Task 4

public class Task {

    private String description;
    private int priority;
    private Date dueDate;
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public Date getDueDate() {
        return dueDate;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public Task(String description, int priority, Date dueDate) {
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
    }
    
    @Override
    public String toString() {
        return "Task [description=" + description + ", priority=" + priority + ", dueDate=" + dueDate + "]";
    }

    
    
}
