package se.lexicon.model;

import java.time.LocalDate;

public class TodoItem {


    private int id;
    String title;
    String taskDescriptiopn;
    LocalDate deadLine;
    boolean done;
    Person creator;

    public TodoItem(int id, String title, String taskDescriptiopn, LocalDate deadLine, boolean done, Person creator) {
        this.id = id;
        this.title = title;
        this.taskDescriptiopn = taskDescriptiopn;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
    }

    public int getId() {
        return id;
    }

/*    public void setId(int id) {
        this.id = id;
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescriptiopn() {
        return taskDescriptiopn;
    }

    public void setTaskDescriptiopn(String taskDescriptiopn) {
        this.taskDescriptiopn = taskDescriptiopn;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", taskDescriptiopn='" + taskDescriptiopn + '\'' +
                ", deadLine=" + deadLine +
                ", done=" + done +
                ", creator=" + creator +
                '}';
    }
}




