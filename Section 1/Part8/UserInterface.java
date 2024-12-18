/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fox
 */
import java.util.Scanner;
//import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scan) {
        this.scanner = scan;
        this.todoList = todoList;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            if (input.equals("add")) {
                System.out.print("Task: ");
                todoList.add(scanner.nextLine());
            } else if (input.equals("list")) {
                todoList.print();
            } else if (input.equals("completed")) {
                System.out.print("Which task was completed? ");
                todoList.remove(Integer.valueOf(scanner.nextLine()) - 1);
            }
        }
    }
}
