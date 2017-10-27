import org.junit.Test;
import static org.junit.Assert.*;

public class UniqueSumTest {
    @Test
    public void testUniqueSum() {
        UniqueSum uniqueSum = new UniqueSum();
        assertEquals("uniqueSum", 20, uniqueSum.doUniqueSum(19, 20, 33));
    }
}