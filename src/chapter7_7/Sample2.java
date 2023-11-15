package chapter7_7;

import chapter6.Tax;

public class Sample2 {
    public static void main(String[] args) {
        Tax t = new Tax(100, "田中宏", 300000, 100000);
        Tax tt = t;

        System.out.println(t);
        System.out.println(tt);
        System.out.println();
        tt.setNumgber(200);
        System.out.println(t);
        System.out.println(tt);

    }
}
