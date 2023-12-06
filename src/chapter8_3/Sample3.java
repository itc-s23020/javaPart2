package chapter8_3;
import java.time.LocalDate;
import java.util.List;
import chapter8_1.GeneralMember;

public class Sample3 {
    public static void main(String[] args) {
        List<GeneralMember> list = List.of(
                new GeneralMember(200, "木村一郎"),
                new  StudentMenber(100, "田中宏", LocalDate.of(2026,3, 31)),
                new  SeniorMember(150, "鈴木", LocalDate.of(1960,3, 31))
        );

        int total = 0;
        for(GeneralMember gem : list) {
            total += gem.membershipFee();
        }
        System.out.println("合計=" + total);
    }
}
