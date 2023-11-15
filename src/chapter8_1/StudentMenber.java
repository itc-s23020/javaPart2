package chapter8_1;
import java.time.LocalDate;
public class StudentMenber extends GeneralMember{
    private  LocalDate expDate;

    public StudentMenber(long id, String name, LocalDate expDate) {
        super(id, name);
        this.expDate = expDate;
    }
    public boolean isExpired(){
        LocalDate today = LocalDate.now();
        return today.isAfter(expDate);
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
}
