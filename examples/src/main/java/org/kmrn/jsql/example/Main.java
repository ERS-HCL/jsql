package org.kmrn.jsql.example;

import static org.kmrn.jsql.sql.Jsql.*;

public class Main {
    public static void main(String[] args) {
        //sql.select(as("e.fname", "name")).from(as("emp","e")).submit();
        
        Sql.newSql().select(as("e.fname", "fname"), as("e.lname", "lname"))
                .from(as(bracket(select("fname", "lname")
                        .from("emp")), "e"))
                .submit();
        
        // where tests
        Sql.newSql().select("fname", "lname")
                    .from("emp")
                    .where(eq("fname","'Kamran'"))
                    .submit();
        
        Sql.newSql().select("fname", "lname")
                    .from("emp")
                    .where(eq("id",1))
                    .submit();
        
        Sql.newSql().select("fname", "lname")
                    .from("emp")
                    .where(eq("fname","'Kamran'"))
                    .and(eq("lname", "'Khan'"))
                    .submit();

    }
}
