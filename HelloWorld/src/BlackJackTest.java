import org.junit.Test;
import static org.junit.Assert.*;

public class BlackJackTest {
    @Test
    public void testBlackJack() {
        BlackJack blackJack = new BlackJack();
        assertEquals("blackJack", 20, blackJack.doBlackJack(19, 20));
    }
}