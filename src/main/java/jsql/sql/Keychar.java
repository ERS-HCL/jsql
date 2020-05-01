package jsql.sql;

public enum Keychar {
    LRB("("), RRB(")"), CMM(","), SPC(" ");

    String name;

    private Keychar(String value) {
        name = value;
    }

    public String toString() {
        return name;
    }
}