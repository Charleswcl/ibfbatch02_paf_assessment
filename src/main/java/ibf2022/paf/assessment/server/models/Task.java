package ibf2022.paf.assessment.server.models;

import java.sql.Date;

// TODO: Task 4

public class Task {

    private int task_Id;
    private String description;
    private int priority;
    private Date dueDate;
    
    public int getTask_Id() {
        return task_Id;
    }
    public void setTask_Id(int task_Id) {
        this.task_Id = task_Id;
    }
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
    @Override
    public String toString() {
        return "Task [task_Id=" + task_Id + ", description=" + description + ", priority=" + priority + ", dueDate="
                + dueDate + "]";
    }
   
  
    
   

}
