package mav.kostas.rockpaperscissors.rules;

import mav.kostas.rockpaperscissors.moves.Move;

/**
 * The {@link Rules} decide one winner, given a set of moves.
 */
public interface Rules {
    /**
     * @param moves the list of moves - one for every player
     * @return the index of the winning move, or -1 in case of tie
     */
    int getWinner(Move... moves);
}
