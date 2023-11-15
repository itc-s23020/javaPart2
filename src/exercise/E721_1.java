package exercise;

import chapter7_2.Joing;

public class E721_1 {
    public static void main(String[] args) {
        Joing j = new Joing("", "-");
        j.add("apple");
        j.add("banana");
        j.add("peach");
        System.out.println(j.getCsv());


    }
}
