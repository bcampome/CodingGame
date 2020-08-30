import java.util.List;
import java.util.Set;

public class FindDuplicateService {

    private final FindDuplicateFunction function;

    public Set<Character> findDuplicate(List<Character> input) {
        return function.apply(input);
    }

    public FindDuplicateService(FindDuplicateFunction function) {
        this.function = function;
    }

}