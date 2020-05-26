package mav.kostas.rockpaperscissors;

import mav.kostas.rockpaperscissors.moves.Move;
import mav.kostas.rockpaperscissors.moves.RockPaperScissorsMoves;
import mav.kostas.rockpaperscissors.strategies.InputStrategy;
import mav.kostas.rockpaperscissors.strategies.RandomStrategy;
import mav.kostas.rockpaperscissors.strategies.Strategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StrategyTest extends IOTest {
    @Test
    public void testInputStrategy() {
        String[] inputs = {"0", "1", "2"};
        mockInput(inputs);
        Strategy simpleInput = new InputStrategy();

        for (String index : inputs) {
            Assert.assertEquals(simpleInput.getNextMove(),
                    RockPaperScissorsMoves.fromIndex(Integer.parseInt(index)));
        }
    }

    @Test
    public void testRandomStrategy() {
        Strategy randomStrategy = new RandomStrategy();
        Set<Move> randomMoves = new HashSet<>();
        // enough iterations for all moves to be generated
        for (int i = 0; i < 100; i++) {
            randomMoves.add(randomStrategy.getNextMove());
        }
        Assert.assertTrue(randomMoves.containsAll(Arrays.asList(RockPaperScissorsMoves.values())));
    }
}
