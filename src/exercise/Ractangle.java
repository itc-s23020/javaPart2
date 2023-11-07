package exercise;

import java.awt.*;

public class Ractangle {
    private double vertical;
    private  double horizontal;

    public Ractangle(double vertical, double horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    public double area() {
        return vertical*horizontal;
    }
}

