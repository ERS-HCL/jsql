package org.kmrn.jsql.sql;

public enum Operator {
    EQ("="), NEQ("!="), GT(">"), GTE(">="), LT("<"), LTE("<=");

    String name;

    private Operator(String value) {
        name = value;
    }

    public String toString() {
        return name;
    }
}