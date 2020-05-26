package mav.kostas.rockpaperscissors;

import org.junit.Test;

import static mav.kostas.rockpaperscissors.moves.RockPaperScissorsMoves.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MoveTest {
    @Test
    public void testWinningMoves() {
        assertTrue(ROCK.beats(SCISSORS));
        assertTrue(PAPER.beats(ROCK));
        assertTrue(SCISSORS.beats(PAPER));
    }

    @Test
    public void testLosingMoves() {
        assertFalse(SCISSORS.beats(ROCK));
        assertFalse(ROCK.beats(PAPER));
        assertFalse(PAPER.beats(SCISSORS));
    }

    @Test
    public void testTieMoves() {
        assertFalse(ROCK.beats(ROCK));
        assertFalse(PAPER.beats(PAPER));
        assertFalse(SCISSORS.beats(SCISSORS));
    }
}
