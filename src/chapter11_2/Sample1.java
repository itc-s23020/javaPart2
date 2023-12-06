package chapter11_2;
import java.util.List;
public class Sample1 {
    public static void main(String[] args) {
        testapple(a -> a.weight()>=300);
    }
    public static void  testapple(Predicate p){
        var list = getappleList();
        for (apple apple : list) {
            if(p.test(apple)){
                System.out.println(apple);
            }
        }
    }
public static List<apple> getappleList(){
        var list = List.of(
                new apple(320,"red"),
                new apple(280,"green"),
                new apple(350, "green"),
                new apple(330, "red"),
                new apple(250, "red")
        );
        return list;
}
}
