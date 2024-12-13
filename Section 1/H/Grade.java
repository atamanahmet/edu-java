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

public class Grade {
    private ArrayList<Integer> points = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();

    public Grade() {

    }

    public void addPoints(int point) {
        if (point >= 0 && point <= 100) {
            this.points.add(point);
        }

    }

    public int sumOfPoints() {
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        return sum;
    }

    public double averageOfPoints() {
        return sumOfPoints() * 1.0 / points.size();
    }
}
