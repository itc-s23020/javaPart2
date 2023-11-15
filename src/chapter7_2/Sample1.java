package chapter7_2;

public class Sample1 {
    public static void main(String[] args) {

        Joing j = new Joing("", ",");
        j.add("apple");
        j.add("banana");
        j.add("peach");
        System.out.println(j.getCsv());


        Joing j2 = new Joing(",");
        j2.add("apple");
        j2.add("banana");
        j2.add("peach");
        System.out.println(j2.getCsv());

        Joing j3 = new Joing(" "," ");
        j3.add("apple");
        j3.add("banana");
        j3.add("peach");
        System.out.println(j2.getCsv());

    }
}