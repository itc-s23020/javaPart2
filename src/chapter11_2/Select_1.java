package chapter11_2;

public class Select_1 implements Predicate{
    public boolean test(apple a) {
        return a.weight() >= 300;
    }
}
