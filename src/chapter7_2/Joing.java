package chapter7_2;

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

public  String getCsv () {
    return csv;
    }
}
