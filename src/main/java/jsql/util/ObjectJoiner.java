package jsql.util;

import java.util.LinkedList;

public class ObjectJoiner {
    private String delimiter;
    LinkedList<Object> list = new LinkedList<>();
    
    private ObjectJoiner(String delimiter) {
        this.delimiter = delimiter;
    }
    
    public ObjectJoiner(String delimiter, Object[] args) {
        this.delimiter = delimiter;
        for(Object arg: args) {
            add(arg);
        }
    }
    
    public static ObjectJoiner newJoiner(String delimiter) {
        return new ObjectJoiner(delimiter);
    }
    
    public static ObjectJoiner newJoiner(String delimiter, Object[] args) {
        return new ObjectJoiner(delimiter, args);
    }
    
    public ObjectJoiner add(Object o) {
        list.add(o);
        list.add(delimiter);
        return this;
    }

    public LinkedList<Object> linkedList() {
        list.removeLast();
        return list;
    }
}
