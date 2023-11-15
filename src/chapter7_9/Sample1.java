package chapter7_9;

public class Sample1 {
    public static void main(String[] args) {

        Id id = new Id(100, "田中宏");
        Tax t = new Tax(id, 300000, 100000);
        System.out.println(t);

        t.getId().setNumber(200);
        System.out.println(t);
    }
}
