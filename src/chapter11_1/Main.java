package chapter11_1;

public class Main {
    public static void main(String[] args) {
        Greeting g = (name) -> {
            return  "Hello" + name;
        };
        String s = g.sayHello("Mike");
        System.out.println(s);
    }
}
