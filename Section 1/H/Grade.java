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
    private ArrayList<Integer> pointsPassing = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();

    public Grade() {

    }

    public void addPoints(int point) {
        if (point >= 0 && point <= 100) {
            this.points.add(point);
            addGrades(point);
            if (point > 50) {
                this.pointsPassing.add(point);
            }
        }

    }

    public void addGrades(int point) {
        int grade = -1;
        if (point < 50) {
            grade = 0;
        } else if (point < 60) {
            grade = 1;
        } else if (point < 70) {
            grade = 2;
        } else if (point < 80) {
            grade = 3;
        } else if (point < 90) {
            grade = 4;
        } else if (point < 100) {
            grade = 5;
        }
        this.grades.add(grade);
    }

    public int sumOfAllPoints() {
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        return sum;
    }

    public String averageOfPassingPoints() {
        int sum = 0;
        if (pointsPassing.isEmpty()) {
            return "-";
        }
        for (int point : pointsPassing) {
            sum += point;
        }
        return String.valueOf(sum * 1.0 / pointsPassing.size());
    }

    public double averageOfPoints() {
        return sumOfAllPoints() * 1.0 / points.size();
    }
}
