import org.junit.jupiter.api.BeforeEach;

public class FIndDuplicateByJava8StreamTest extends AbstractDuplicateTest {

    @Override
    @BeforeEach
    public void init() {
        findDuplicateService = new FindDuplicateService(FindDuplicateFunction::findByJava8Steam);
    }
}
