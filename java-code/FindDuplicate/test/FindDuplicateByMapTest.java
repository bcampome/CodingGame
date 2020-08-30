import org.junit.jupiter.api.BeforeEach;

public class FindDuplicateByMapTest  extends AbstractDuplicateTest{
    @Override
    @BeforeEach
    public void init() {
        this.findDuplicateService = new FindDuplicateService(FindDuplicateFunction::findDuplicateByMap);
    }
}
