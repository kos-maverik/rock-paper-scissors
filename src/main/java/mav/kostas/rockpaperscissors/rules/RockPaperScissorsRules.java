package mav.kostas.rockpaperscissors.rules;

import mav.kostas.rockpaperscissors.moves.Move;

import static mav.kostas.rockpaperscissors.rules.ResultConstants.*;

public class RockPaperScissorsRules implements Rules {

    /**
     * Decides the winner on a Rock Paper Scissors game.
     *
     * @param playerMoves an array containing two elements, each player's move
     * @return 0 if player one wins, 1 if player two wins, -1 in case of tie
     * @see ResultConstants
     */
    @Override
    public int getWinner(Move... playerMoves) {
        if (playerMoves.length != 2) {
            throw new RuntimeException("Two players are needed. Got " + playerMoves.length + " instead.");
        }
        Move playerOneMove = playerMoves[PLAYER_ONE];
        Move playerTwoMove = playerMoves[PLAYER_TWO];

        if (playerOneMove.beats(playerTwoMove)) return PLAYER_ONE;
        if (playerTwoMove.beats(playerOneMove)) return PLAYER_TWO;
        return TIE;
    }
}
