import org.junit.Test;
import static org.junit.Assert.*;

public class TooHotTest {
    @Test
    public void testTooHot() {
        TooHot tooHot = new TooHot();
        assertEquals("tooHot", false, tooHot.doTooHot(19, false));
    }
}