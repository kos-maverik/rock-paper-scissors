package mav.kostas.rockpaperscissors.strategies;

import mav.kostas.rockpaperscissors.moves.Move;

/**
 * A {@link Strategy} is a generic move generator.
 * <p>
 * The implementation decides the logic of the move sequence (e.g. random, sequential, constant).
 */
public interface Strategy {
    Move getNextMove();
}
