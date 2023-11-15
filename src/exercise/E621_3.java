package exercise;

import java.awt.*;

public class E621_3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3.1, 4.6);
        Rectangle r2 = new Rectangle(4.1, 5.6);
        Rectangle r3= new Rectangle(5.1, 6.6);

        System.out.printf("面積=%2f%n", r1.area());
        System.out.printf("面積=%2f%n", r2.area());
        System.out.printf("面積=%2f%n", r3.area());
    }
}