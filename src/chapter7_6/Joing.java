package chapter7_6;

public class Joing {
    private String csv;
    private String delimiter;

    public Joing(String csv, String delimiter) {
        this.csv = csv;
        this.delimiter = delimiter;
    }

    public Joing(String delimiter) {
        this.csv = "";
        this.delimiter = delimiter;
    }

    public void add(String s) {
        csv += csv.isEmpty() ? s : delimiter + s;
    }

    public String getCsv() {
        return csv;
    }

    public static void main(String[] args) {
        Joing j = new Joing("", ",");

        j.add("apple");
        j.add("banana");
        j.add("peach");
        System.out.println(j.getCsv());
    }
}
