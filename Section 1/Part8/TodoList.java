/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fox
 */
import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list = new ArrayList<>();

    public TodoList() {

    }

    public void add(String item) {
        this.list.add(item);
    }

    public void print() {
        for (String item : list) {
            System.out.println((list.indexOf(item) + 1) + ": " + item);
        }
    }

    public void remove(int index) {
        this.list.remove(index - 1);
    }
}
