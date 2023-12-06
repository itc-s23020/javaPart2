package chapter9_1;

import java.time.LocalDate;
import java.util.List;

public class Sample2 {
    public static void main(String[] args) {
        var list = List.of(
                    new GeneralMember(200, "木村一郎"),
                    new StudentMemberclass(100, "田中宏", LocalDate.of(2026, 3, 31)),
                    new SeniorMember(150, "鈴木",LocalDate.of(1960, 3, 31))
            );
            int total = 0;
            for (var member : list) {
                total += member.fee();
            }
            System.out.println("total=" +total);

    }
}