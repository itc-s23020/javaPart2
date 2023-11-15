package chapter7_7;

import chapter6.Tax;

public class Sample3 {
    public static void main(String[] args) {
            Tax t = new Tax(100, "田中宏", 300000, 100000);
            sub(t);
            System.out.println(t);
        }
        public static void sub(Tax tt) {
        tt.setNumgber(200);
        }

}
