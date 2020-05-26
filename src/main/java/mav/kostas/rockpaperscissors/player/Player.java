package mav.kostas.rockpaperscissors.player;

import mav.kostas.rockpaperscissors.moves.Move;

/**
 * A {@link Player} is an entity whose sole purpose is to win.
 * <p>
 * For this, they need to keep track of their score and generate winning moves.
 */
public interface Player {
    String getName();

    Move getLastMove();

    Move getNextMove();

    int getScore();

    void increaseScore();
}
