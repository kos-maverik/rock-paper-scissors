package mav.kostas.rockpaperscissors.player;

import mav.kostas.rockpaperscissors.moves.Move;
import mav.kostas.rockpaperscissors.strategies.Strategies;
import mav.kostas.rockpaperscissors.strategies.Strategy;

/**
 * A {@link RealPlayer} is a named player that has decided on their winning strategy.
 * <p>
 * Given that {@link Strategy}, they generate and then play a sequence of moves.
 * Since they always remember their last move, more complex strategies (AI or psychology) can be used.
 */
public class RealPlayer implements Player {
    private final String name;
    private final Strategy strategy;
    private Move lastMove;
    private int score;

    /**
     * @param strategy enum containing the decided strategy. This parameter can also be used
     *                 for implementing a Factory method design pattern, in case of groups (subclasses) of
     *                 Players with common strategies (e.g. AlwaysRockPlayer, SequentialMovesPlayer, RandomMovePlayer)
     */
    public RealPlayer(String name, Strategies strategy) {
        this.name = name;
        this.strategy = strategy.get();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Move getLastMove() {
        return lastMove;
    }

    @Override
    public Move getNextMove() {
        lastMove = strategy.getNextMove();
        return lastMove;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void increaseScore() {
        this.score++;
    }
}
