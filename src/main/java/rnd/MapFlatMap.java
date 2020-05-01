package rnd;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFlatMap {
    
    public static void main(String[] args) {
        MapFlatMap mapFlatMap = new MapFlatMap();
        mapFlatMap.map();
        mapFlatMap.flatMap();
    }
    
    public void map() {
        List<String> collected = Stream.of("a", "b", "hello") 
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collected);
    }
    
    public void flatMap() {
        List<Integer> together = Stream.of(Optional.of(Arrays.asList(1)))
                .flatMap(val -> val.get().stream())
                .collect(Collectors.toList());
        
        System.out.println(together);
    }
}
