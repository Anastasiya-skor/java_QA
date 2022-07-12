package ru.stqa.qa.sandbox;

public class MyFirstProgram {
    public static void main (String[] args) {
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 1;
        Point p2 = new Point();
        p2.x = 4;
        p2.y = 5;
        System.out.println("Расстояние между точками " + "p1" + "(" + p1.x + "," + p1.y + ")" + " и " + "p2" + "(" + p2.x + "," + p2.y + ")" + " равно " + p1.distance(p2));

    }
}
