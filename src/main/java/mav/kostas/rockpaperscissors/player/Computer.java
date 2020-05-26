package mav.kostas.rockpaperscissors.player;

import mav.kostas.rockpaperscissors.strategies.Strategies;

/**
 * A {@link Computer} is a unique type of player, thus using the Singleton pattern.
 * <p>
 * The Computer's strategy is picking random moves.
 */
public class Computer extends RealPlayer {
    private static RealPlayer instance;

    private Computer() {
        super("Computer", Strategies.RANDOM);
    }

    public static Player getInstance() {
        if (instance == null) {
            instance = new Computer();
        }
        return instance;
    }
}
