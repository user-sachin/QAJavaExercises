import org.junit.Test;
import static org.junit.Assert.*;

public class PlayGameTest {
    @Test
    public void testTooHot() {
        PlayGame playGameNorth = new PlayGame();
        assertEquals("playGameTestMoveNorth", "4.72", playGameNorth.distanceFromEnd(PlayGame.Direction.N));
        assertEquals("playGameTestMoveSouth", "5.00", playGameNorth.distanceFromEnd(PlayGame.Direction.S));
        assertEquals("playGameTestMoveEast", "5.41", playGameNorth.distanceFromEnd(PlayGame.Direction.E));
        assertEquals("playGameTestMoveWest", "5.00", playGameNorth.distanceFromEnd(PlayGame.Direction.W));
    }
}