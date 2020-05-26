package mav.kostas.rockpaperscissors;

import mav.kostas.rockpaperscissors.moves.Move;
import mav.kostas.rockpaperscissors.moves.RockPaperScissorsMoves;
import mav.kostas.rockpaperscissors.rules.RockPaperScissorsRules;
import mav.kostas.rockpaperscissors.rules.Rules;
import org.junit.Test;

import static mav.kostas.rockpaperscissors.rules.ResultConstants.*;
import static org.junit.Assert.assertEquals;

public class RulesTest {
    @Test
    public void testWinner() {
        Move playerMove = RockPaperScissorsMoves.ROCK;

        Move losingMove = RockPaperScissorsMoves.SCISSORS;
        Move winningMove = RockPaperScissorsMoves.PAPER;
        Move tieMove = RockPaperScissorsMoves.ROCK;

        Rules rules = new RockPaperScissorsRules();

        assertEquals(rules.getWinner(playerMove, losingMove), PLAYER_ONE);
        assertEquals(rules.getWinner(playerMove, winningMove), PLAYER_TWO);
        assertEquals(rules.getWinner(playerMove, tieMove), TIE);
    }
}
