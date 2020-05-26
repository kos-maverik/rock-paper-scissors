package mav.kostas.rockpaperscissors.game;

import mav.kostas.rockpaperscissors.moves.Move;
import mav.kostas.rockpaperscissors.player.Player;
import mav.kostas.rockpaperscissors.rules.Rules;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static mav.kostas.rockpaperscissors.rules.ResultConstants.TIE;

/**
 * A game consists of a list of players, a set of rules and an iteration of rounds.
 * <p>
 * Each {@link Player} decides and then plays their own moves.
 * After all rounds have been finished, one winner is chosen depending on the set of {@link Rules}.
 * <p>
 * This abstract class is using the Template Method pattern.
 * Each implementation can decide on the details of the game and on the messages that are shown to the user.
 */
public abstract class Game {
    protected List<Player> players = new ArrayList<>();
    protected Rules rules;
    protected int numRounds;

    public void play() {
        init();
        for (int i = 1; i <= numRounds; i++) {
            printRoundStart(i);
            playRound();
        }
        sortByScore();
        printResults();
    }

    private void init() {
        printHello();
        setPlayers();
        setRules();
        setNumRounds();
    }

    private void playRound() {
        Move[] currentMoves = getMovesFromAllPlayers();
        int winner = rules.getWinner(currentMoves);
        if (winner != TIE) {
            players.get(winner).increaseScore();
        }
        printRoundStats(winner);
    }

    private Move[] getMovesFromAllPlayers() {
        return players.stream()
                .map(Player::getNextMove)
                .toArray(Move[]::new);
    }

    private void sortByScore() {
        players.sort(Comparator.comparingInt(Player::getScore).reversed());
    }

    protected abstract void printHello();

    protected abstract void printRoundStart(int round);

    protected abstract void printRoundStats(int winner);

    protected abstract void printResults();

    protected abstract void setNumRounds();

    protected abstract void setRules();

    protected abstract void setPlayers();
}
