package chapter9_1;

import org.ietf.jgss.GSSName;

import java.time.LocalDate;
import java.util.Objects;

public class Sample3 {
    public static void main(String[] args) {
        Member m1 = new StudentMemberclass(200, "木村一郎", LocalDate.of(2026, 3, 31));
        // Member m1 = new SeniorMember(150,"すずき", LocalDate.of(1960, 3, 31));
        if (m1 instanceof StudentMemberclass) {
            StudentMemberclass sm = (StudentMemberclass) m1;
            System.out.println("期限日" + sm.getExpDate());
        }
        if (m1 instanceof StudentMemberclass stm)
        {
            System.out.println("期限日" + stm.getExpDate());
        }
//  /      Objects o = new GeneralMember(200, "木村一郎");
      //  if (o instanceof Member m2) {
      //      System.out.println("名前=" + m2.getName());
        }

    }
//}
