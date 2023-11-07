package exercise;


import chapter6.Tax;

public class E621_1 {
    public static void main(String[] args) {
        Tax Kimura = new Tax(110, "木村一郎", 300000, 90000);
        Tax Suzuki = new Tax(110, "鈴木武", 300000, 90000);
        Tax Saito = new Tax(110, "斎藤渉", 300000, 90000);

        System.out.println(Kimura.zeigaku());
        System.out.println(Suzuki.zeigaku());
        System.out.println(Saito.zeigaku());
    }
}
