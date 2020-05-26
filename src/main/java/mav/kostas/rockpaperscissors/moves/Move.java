package mav.kostas.rockpaperscissors.moves;

import java.util.Collection;

/**
 * A {@link Move} is one of many moves in a game.
 * <p>
 * An enum implementation must contain the complete list of moves and the interactions between them.
 */
public interface Move {
    /**
     * @return the complete list of moves that lose against this one
     */
    Collection<Move> beats();

    /**
     * Defines the interaction between different moves.
     *
     * @param move the opponent's move
     * @return true if it wins against the opponent's move, false in case of defeat or tie
     */
    default boolean beats(Move move) {
        return this.beats().contains(move);
    }
}
