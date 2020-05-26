package mav.kostas.rockpaperscissors.strategies;

import mav.kostas.rockpaperscissors.moves.Move;
import mav.kostas.rockpaperscissors.moves.RockPaperScissorsMoves;
import mav.kostas.rockpaperscissors.utils.scanner.BoundedIntScanner;

/**
 * A generator that translates the user input into Rock Paper Scissors moves.
 */
public class InputStrategy implements Strategy {
    private static final BoundedIntScanner sc = new BoundedIntScanner(RockPaperScissorsMoves.values().length - 1);

    @Override
    public Move getNextMove() {
        System.out.println("What is your next move? [0] Rock, [1] Paper or [2] Scissors?");
        return RockPaperScissorsMoves.fromIndex(sc.next());
    }
}
