package chapter7_5;

public class Sample1 {
    public static void main(String[] args) {
        StaticJoing.init("", ",");

        StaticJoing.add("apple");
        StaticJoing.add("banana");
        StaticJoing.add("peach");
        System.out.println(StaticJoing.getCsv());
    }
}