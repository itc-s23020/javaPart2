package exercise;

import java.awt.*;

public class E621_3 {
    public static void main(String[] args) {
        Ractangle r1 = new Ractangle(3.1, 4.6);
        Ractangle r2 = new Ractangle(4.1, 5.6);
        Ractangle r3= new Ractangle(5.1, 6.6);

        System.out.printf("面積=%2f%n", r1.area());
        System.out.printf("面積=%2f%n", r2.area());
        System.out.printf("面積=%2f%n", r3.area());
    }
}