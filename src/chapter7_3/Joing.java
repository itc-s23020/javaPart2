package chapter7_3;

public class Joing {
    private String str;
    private String delimiter;

    public Joing(String str, String delimiter) {
        this.str = str;
        this.delimiter = delimiter;
    }

    public Joing(String delimiter) {
        this("",delimiter);
    }
    public Joing() {
        this("", ",");
    }

    public void add(String s) {
    str += str.isEmpty() ? s : delimiter + s;
}

public  String getCsv () {
    return str;
    }
}
