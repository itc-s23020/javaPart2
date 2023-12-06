package chapter10_2;

import chapter10_2.Ratelntf;

public class Rate3 implements Ratelntf {
    @Override
    public double taxRate(int gaku) {
        return gaku<160 ?  0.001875 * gaku : 0.3;
    }
}
