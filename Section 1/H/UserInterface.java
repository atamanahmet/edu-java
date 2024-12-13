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

public class UserInterface {
    private Scanner scanner;
    private Grade grades;

    public UserInterface() {

    }

    public UserInterface(Scanner scanner, Grade grades) {
        this.scanner = scanner;
        this.grades = grades;
    }

    public void getInput() {
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break;
            }
            int point = Integer.valueOf(input);
            grades.addPoints(point);
        }
    }
}
