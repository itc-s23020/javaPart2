package chapter6;

import java.util.Objects;
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

    public int getNumgber() {
        return numgber;
    }

    public void setNumgber(int numgber) {
        this.numgber = numgber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShotoku() {
        return shotoku;
    }

    public void setShotoku(int shotoku) {
        this.shotoku = shotoku;
        if (koujo > this.shotoku){
            //設定済みの控除額よりも所得額が下回ったら調整する。
            koujo = this.shotoku;
        }
    }

    public int getKoujo() {
        return koujo;
    }

    public void setKoujo(int koujo) {
        if (shotoku < koujo) {
            this.koujo = shotoku;
        } else {
            this.koujo = koujo;
        }
    }

    @Override
    public String toString() {
        return "Tax{" +
                "numgber=" + numgber +
                ", name='" + name + '\'' +
                ", shotoku=" + shotoku +
                ", koujo=" + koujo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tax tax = (Tax) o;
        return numgber == tax.numgber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numgber);
    }

    public int zeigaku () {
        return (int) ((shotoku - koujo)*0.1);
    }
}
