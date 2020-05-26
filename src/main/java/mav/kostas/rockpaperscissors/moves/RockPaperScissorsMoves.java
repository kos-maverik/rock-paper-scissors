package mav.kostas.rockpaperscissors.moves;

import java.util.Collection;
import java.util.Collections;

/**
 * All the possible moves from a Rock Paper Scissors game, including the interactions between them.
 */
public enum RockPaperScissorsMoves implements Move {
    ROCK {
        @Override
        public Collection<Move> beats() {
            return Collections.singleton(SCISSORS);
        }
    },
    PAPER {
        @Override
        public Collection<Move> beats() {
            return Collections.singleton(ROCK);
        }
    },
    SCISSORS {
        @Override
        public Collection<Move> beats() {
            return Collections.singleton(PAPER);
        }
    };

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }

    /**
     * @throws RuntimeException if given an invalid index
     */
    public static RockPaperScissorsMoves fromIndex(int index) {
        return RockPaperScissorsMoves.values()[index];
    }
}
