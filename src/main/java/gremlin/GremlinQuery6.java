package gremlin;

import java.util.function.BiFunction;

public class GremlinQuery6 {

    private static final String _V = "V";
    private static final String _E = "E";
    private static final String _fold = "fold";
    private static final String _unfold = "unfold";
    private static final String _coalesce = "coalesce";
    private static final String _addV = "addV";
    private static final String _addE = "addE";
    private static final String _as = "as";
    private static final String _out = "out";
    private static final String _outE = "outE";
    private static final String _outV = "outV";
    private static final String _inE = "inE";
    private static final String _inV = "inV";
    private static final String _where = "where";
    private static final String _is = "is";
    private static final String _to = "to";
    private static final String _and = "and";
    private static final String _or = "or";
    private static final String _values = "values";
    private static final String _valueMap = "valueMap";
    private static final String _by = "by";
    private static final String _project = "project";
    private static final String _hasLabel = "hasLabel";
    private static final String _property = "property";

    public static GremlinQuery V(Object... args) {
        GremlinQuery query = new GremlinQuery(_V);
        return F.apply(query, args);
    }

    public static GremlinQuery E(Object... args) {
        GremlinQuery query = new GremlinQuery(_E);
        return F.apply(query, args);
    }

    public static GremlinQuery fold(Object... args) {
        GremlinQuery query = new GremlinQuery(_fold);
        return F.apply(query, args);
    }

    public static GremlinQuery unfold(Object... args) {
        GremlinQuery query = new GremlinQuery(_unfold);
        return F.apply(query, args);
    }

    public static GremlinQuery coalesce(Object... args) {
        GremlinQuery query = new GremlinQuery(_coalesce);
        return F.apply(query, args);
    }

    public static GremlinQuery addV(Object... args) {
        GremlinQuery query = new GremlinQuery(_addV);
        return F.apply(query, args);
    }

    public static GremlinQuery addE(Object... args) {
        GremlinQuery query = new GremlinQuery(_addE);
        return F.apply(query, args);
    }

    public static GremlinQuery as(Object... args) {
        GremlinQuery query = new GremlinQuery(_as);
        return F.apply(query, args);
    }

    public static GremlinQuery out(Object... args) {
        GremlinQuery query = new GremlinQuery(_out);
        return F.apply(query, args);
    }

    public static GremlinQuery outE(Object... args) {
        GremlinQuery query = new GremlinQuery(_outE);
        return F.apply(query, args);
    }

    public static GremlinQuery outV(Object... args) {
        GremlinQuery query = new GremlinQuery(_outV);
        return F.apply(query, args);
    }

    public static GremlinQuery inE(Object... args) {
        GremlinQuery query = new GremlinQuery(_inE);
        return F.apply(query, args);
    }

    public static GremlinQuery inV(Object... args) {
        GremlinQuery query = new GremlinQuery(_inV);
        return F.apply(query, args);
    }

    public static GremlinQuery where(Object... args) {
        GremlinQuery query = new GremlinQuery(_where);
        return F.apply(query, args);
    }

    public static GremlinQuery is(Object... args) {
        GremlinQuery query = new GremlinQuery(_is);
        return F.apply(query, args);
    }

    public static GremlinQuery to(Object... args) {
        GremlinQuery query = new GremlinQuery(_to);
        return F.apply(query, args);
    }

    public static GremlinQuery and(Object... args) {
        GremlinQuery query = new GremlinQuery(_and);
        return F.apply(query, args);
    }

    public static GremlinQuery or(Object... args) {
        GremlinQuery query = new GremlinQuery(_or);
        return F.apply(query, args);
    }

    public static GremlinQuery values(Object... args) {
        GremlinQuery query = new GremlinQuery(_values);
        return F.apply(query, args);
    }

    public static GremlinQuery valueMap(Object... args) {
        GremlinQuery query = new GremlinQuery(_valueMap);
        return F.apply(query, args);
    }

    public static GremlinQuery by(Object... args) {
        GremlinQuery query = new GremlinQuery(_by);
        return F.apply(query, args);
    }

    public static GremlinQuery project(Object... args) {
        GremlinQuery query = new GremlinQuery(_project);
        return F.apply(query, args);
    }

    public static GremlinQuery hasLabel(Object... args) {
        GremlinQuery query = new GremlinQuery(_hasLabel);
        return F.apply(query, args);
    }

    public static GremlinQuery property(Object... args) {
        GremlinQuery query = new GremlinQuery(_property);
        return F.apply(query, args);
    }

    static BiFunction<GremlinQuery, Object[], GremlinQuery> F = (query, args) -> {
        return query.append(args);
    };

    public static class GremlinQuery {

        private StringBuffer query = new StringBuffer();

        public GremlinQuery() {
        }

        public GremlinQuery(String s) {
            query.append(s);
        }

        public GremlinQuery append(String name, Object[] args) {
            query.append(name).append("(");
            
            
            for (Object arg : args) {
                if(arg instanceof GremlinQuery) {
                    query.append(arg.toString());
                } else {
                    query.append("'").append(arg.toString()).append("'");
                }
                query.append(",");
                
            }
            
            int lastIndex = query.length()-1;
            if(query.charAt(lastIndex) == ',') {
                query.deleteCharAt(lastIndex);
            }
            
            query.append(")");
            return this;
        }

        public GremlinQuery V(Object... args) {
            return append("." + _V, args);
        }

        public GremlinQuery E(Object... args) {
            return append("." + _E, args);
        }

        public GremlinQuery fold(Object... args) {
            return append("." + _fold, args);
        }

        public GremlinQuery unfold(Object... args) {
            return append("." + _unfold, args);
        }

        public GremlinQuery coalesce(Object... args) {
            return append("." + _coalesce, args);
        }

        public GremlinQuery addV(Object... args) {
            return append("." + _addV, args);
        }

        public GremlinQuery addE(Object... args) {
            return append("." + _addE, args);
        }

        public GremlinQuery as(Object... args) {
            return append("." + _as, args);
        }

        public GremlinQuery out(Object... args) {
            return append("." + _out, args);
        }

        public GremlinQuery outE(Object... args) {
            return append("." + _outE, args);
        }

        public GremlinQuery outV(Object... args) {
            return append("." + _outV, args);
        }

        public GremlinQuery inE(Object... args) {
            return append("." + _inE, args);
        }

        public GremlinQuery inV(Object... args) {
            return append("." + _inV, args);
        }

        public GremlinQuery where(Object... args) {
            return append("." + _where, args);
        }

        public GremlinQuery is(Object... args) {
            return append("." + _is, args);
        }

        public GremlinQuery to(Object... args) {
            return append("." + _to, args);
        }

        public GremlinQuery and(Object... args) {
            return append("." + _and, args);
        }

        public GremlinQuery or(Object... args) {
            return append("." + _or, args);
        }

        public GremlinQuery values(Object... args) {
            return append("." + _values, args);
        }

        public GremlinQuery valueMap(Object... args) {
            return append("." + _valueMap, args);
        }

        public GremlinQuery by(Object... args) {
            return append("." + _by, args);
        }

        public GremlinQuery project(Object... args) {
            return append("." + _project, args);
        }

        public GremlinQuery hasLabel(Object... args) {
            return append("." + _hasLabel, args);
        }

        public GremlinQuery property(Object... args) {
            return append("." + _property, args);
        }

        public GremlinQuery append(Object[] args) {
            return append("", args);
        }

        @Override
        public String toString() {
            return query.toString();
        }
    }
}