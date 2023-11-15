package chapter8_2;

public class GeneralMember {
    private long id;
    private String name;

    public GeneralMember(long id, String name, Lesson lesson) {
        this.id = id;
        this.name = name;
    }
    public int membershipFee() {
        return 1000;
}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
