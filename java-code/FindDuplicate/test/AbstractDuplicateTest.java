import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class AbstractDuplicateTest {

    protected FindDuplicateService findDuplicateService;

    @BeforeEach
    public abstract void init();

    @Test
    public void should_returnEmptySet_when_EmptyInput() {

        // given
        List<Character> input = Collections.emptyList();

        // when
        Set<Character> duplicate = findDuplicateService.findDuplicate(input);

        //then
        Set<Character> expected = Collections.emptySet();
        assertEquals(expected, duplicate);
    }

    @Test
    public void should_returnA_when_inputABCA() {
        // given
        List<Character> input = Arrays.asList('A', 'B', 'C', 'A');

        // when
        Set<Character> duplicate = findDuplicateService.findDuplicate(input);

        //then
        Set<Character> expected = Collections.singleton('A');
        assertEquals(expected, duplicate);
    }

    @Test
    public void should_returnBA_when_inputABBAC() {
        // given
        List<Character> input = Arrays.asList('A', 'B', 'B', 'A', 'C');

        // when
        Set<Character> duplicate = findDuplicateService.findDuplicate(input);

        //then
        Set<Character> expected = Set.of('B', 'A');
        assertEquals(expected, duplicate);
    }

    @Test
    public void should_returnABAABC_when_inputABBAC() {
        // given
        List<Character> input = Arrays.asList('A', 'B', 'A', 'A', 'B', 'C');

        // when
        Set<Character> duplicate = findDuplicateService.findDuplicate(input);

        //then
        Set<Character> expected = Set.of('A', 'B');
        assertEquals(expected, duplicate);
    }

}