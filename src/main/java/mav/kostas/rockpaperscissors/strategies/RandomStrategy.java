package mav.kostas.rockpaperscissors.strategies;

import mav.kostas.rockpaperscissors.moves.Move;
import mav.kostas.rockpaperscissors.moves.RockPaperScissorsMoves;

import java.util.Random;

/**
 * A random Rock Paper Scissors move generator.
 */
public class RandomStrategy implements Strategy {
    private final Random rng = new Random();

    @Override
    public Move getNextMove() {
        int moveIndex = rng.nextInt(RockPaperScissorsMoves.values().length);
        return RockPaperScissorsMoves.fromIndex(moveIndex);
    }
}
