import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {

    List<String> list = Arrays.asList("a", "b", "c", "a", "c");

    public List<String> returnDuplicatesOfList(List<String> list) {
            return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream().filter(e -> 1 < e.getValue())
            .map(Map.Entry::getKey).collect(Collectors.toList());
    }

    public boolean searchDuplicatesOfList(List<String> list) {
        Iterator<String> valueIterator = list.iterator();
        Set<String> visited = new HashSet<>();
        boolean result = true;
        while (result && valueIterator.hasNext()) {
            result = visited.add(valueIterator.next());
        }
        return result;
    }
}
