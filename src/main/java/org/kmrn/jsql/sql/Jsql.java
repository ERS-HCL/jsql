package jsql.sql;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

import jsql.executer.SqlExecuter;
import jsql.util.ObjectJoiner;

public class Jsql {

    // https://forcedotcom.github.io/phoenix/index.html

    public static Sql select(Object... args) {
        return Sql.newSql().select(args);
    }

    public static Sql as(Object... args) {
        return Sql.newSql().as(args);
    }

    public static Sql bracket(Object... args) {
        return Sql.newSql().bracket(args);
    }
    
    public static Sql eq(Object... args) {
        return Sql.newSql().eq(args);
    }

    // class
    public static class Sql {

        private LinkedList<Stmt> stmts = new LinkedList<>();
        private SqlExecuter executer = new SqlExecuter();

        public static Sql newSql() {
            return new Sql();
        }

        public Sql select(Object... args) {
            LinkedList<Object> list = ObjectJoiner.newJoiner(Keychar.CMM.toString(), args).linkedList();
            list.addFirst(Keyword.SELECT);
            stmts.add(Stmt.newStmt(list));
            return this;
        }

        public Sql from(Object... args) {
            LinkedList<Object> list = linkedList(args);
            list.addFirst(Keyword.FROM);
            stmts.add(Stmt.newStmt(list));
            return this;
        }

        Sql bracket(Object... args) {
            LinkedList<Object> list = linkedList(args);
            list.addFirst(Keychar.LRB);
            list.addLast(Keychar.RRB);
            stmts.add(Stmt.newStmt(list));
            return this;
        }

        Sql as(Object... args) {
            LinkedList<Object> list = linkedList(args);
            list.add(1, Keyword.AS); // Add AS in the middle
            stmts.add(Stmt.newStmt(list));
            return this;
        }
        
        public Sql where(Object... args) {
            LinkedList<Object> list = linkedList(args);
            list.addFirst(Keyword.WHERE);
            stmts.add(Stmt.newStmt(list));
            return this;
        }
        
        public Sql and(Object... args) {
            LinkedList<Object> list = linkedList(args);
            list.addFirst(Keyword.AND);
            stmts.add(Stmt.newStmt(list));
            return this;
        }
        
        Sql eq(Object... args) {
            LinkedList<Object> list = linkedList(args);
            list.add(1, Operator.EQ);
            stmts.add(Stmt.newStmt(list));
            return this;
        }

        private LinkedList<Object> linkedList(Object[] args) {
            return new LinkedList<>(Arrays.asList(args));
        }

        @Override
        public String toString() {
            String str = stmts.stream().flatMap(o -> o.tokens().stream()).map(Object::toString)
                    .collect(Collectors.joining(" "));
            return str;
        }

        public void submit() {
            executer.execute(toString());
        }
    }

    public static class Stmt {
        
        private LinkedList<Object> tokens = new LinkedList<>();

        private Stmt(LinkedList<Object> args) {
            this.tokens = args;
        }

        public static Stmt newStmt(LinkedList<Object> args) {
            return new Stmt(args);
        }

        public LinkedList<Object> tokens() {
            return tokens;
        }

        @Override
        public String toString() {
            return tokens.toString();
        }
    }
}