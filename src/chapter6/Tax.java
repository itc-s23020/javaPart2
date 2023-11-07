package chapter6;

import java.util.SplittableRandom;

public class Tax{
    private int numgber; //納税番号
    private String name; //指名
    private int shotoku; //所得額
    private  int koujo; //控除額

    public Tax(int numgber, String name, int shotoku, int koujo) {
        this.numgber = numgber;
        this.name = name;
        this.shotoku = shotoku;
        this.koujo = koujo;
    }

    public int zeigaku () {
        return (int) ((shotoku - koujo)*0.1);
    }
}
