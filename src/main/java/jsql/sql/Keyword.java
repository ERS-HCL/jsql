package jsql.sql;

public enum Keyword {
    SELECT("SELECT"), FROM("FROM"), AS("AS"), WHERE("WHERE"), BRKT("BRKT"), AND("AND");

    String name;

    private Keyword(String value) {
        name = value;
    }

    public String toString() {
        return name;
    }
}