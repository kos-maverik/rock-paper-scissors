package mav.kostas.rockpaperscissors.strategies;

import mav.kostas.rockpaperscissors.player.RealPlayer;

import java.util.function.Supplier;

/**
 * An enum that facilitates the instantiation of a {@link RealPlayer} class.
 */
public enum Strategies {
    RANDOM(RandomStrategy::new),
    INPUT(InputStrategy::new);

    public Strategy get() {
        return strategy.get();
    }

    private final Supplier<Strategy> strategy;

    Strategies(Supplier<Strategy> strategy) {
        this.strategy = strategy;
    }
}
