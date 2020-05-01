package gremlin;

import static gremlin.GremlinQuery6.*;

public class Main {
    public static void main(String[] args) {
        String id = "id123";
        
        GremlinQuery q0 = V(id);
        System.out.println(q0);
        
        GremlinQuery q1 = V(E());
        System.out.println(q1);
        
        GremlinQuery q2 = V(id, "2", V(3, 4, E(5, 6, 7))).fold().property("n1", "v1", "n2", "v2");
        System.out.println(q2);
        
        GremlinQuery q3 = V().hasLabel("levelMember")
                    .where(values("tenantId").is("@@@tenantId")
                    .and().values("calcEngineId").is("@@@calcEngineId")
                    .and().values("dimension").is("@@@dimension")
                    .and().values("level").is("@@@level"))
                    .project("@@@member", "@@@parent")
                    .by(valueMap())
                    .by(outE("parent")
                    .project("level","name")
                    .by("level").by("name").fold());
                      
        System.out.println(q3);
    }
}
