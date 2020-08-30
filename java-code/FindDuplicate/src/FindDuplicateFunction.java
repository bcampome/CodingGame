import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface
public interface FindDuplicateFunction {

    public Set<Character> apply(List<Character> input);

     static Set<Character> findByJava8Steam(List<Character> input) {
        return input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

     static Set<Character> findDuplicateByMap(List<Character> input) {
        Set<Character> output = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        input.forEach(c -> {
            int number = map.getOrDefault(c, 0);
            map.put(c, number += 1);
        });
        map.forEach((c, number) -> {
            if (number > 1) {
                output.add(c);
            }
        });
        return output;
    }

}
