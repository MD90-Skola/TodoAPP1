package se.lexicon.model;

public class TodoItemTask {


    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(int id, boolean assigned, TodoItem todoItem) {
        this.id = id;
        this.assigned = assigned;
        this.todoItem = todoItem;
        this.assigned = assignee != null;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }


    @Override
    public String toString() {
        return "TodoItemTask{" +
                "id=" + id +
                ", assigned=" + assigned +
                ", todoItem=" + todoItem +
                ", assignee=" + assignee +
                '}';
    }
}
