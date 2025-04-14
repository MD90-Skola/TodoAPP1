package se.lexicon;

import se.lexicon.model.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Appuser accountForMichel = new Appuser("admin", "123456", AppRole.ROLE_APP_ADMIN);
        Appuser accountForErik = new Appuser("erik", "111111", AppRole.ROLE_APP_USER);

        Person michel = new Person(1, "Michle", "Dal", "michel@test.se");
        michel.setCredentials(accountForMichel);
        System.out.println("michel = " + michel);

        Person erik = new Person(1, "Erik", "Dal", "erik@test.se");
        erik.setCredentials(accountForErik);
        System.out.println("erik = " + erik);


        TodoItem installWindows11 = new TodoItem(1, "Install Windows 11 on the Server", "Desc...", LocalDate.now().plusDays(10), false, michel);
        TodoItemTask todoItemTaskForWindow11 = new TodoItemTask(1, true, installWindows11);
        todoItemTaskForWindow11.setAssignee(erik);
        System.out.println("todoItemTaskForWindow11 = " + todoItemTaskForWindow11);
    }
}