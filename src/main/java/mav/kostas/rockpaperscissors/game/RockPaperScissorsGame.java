package mav.kostas.rockpaperscissors.game;

import mav.kostas.rockpaperscissors.player.Computer;
import mav.kostas.rockpaperscissors.player.Player;
import mav.kostas.rockpaperscissors.player.RealPlayer;
import mav.kostas.rockpaperscissors.rules.RockPaperScissorsRules;
import mav.kostas.rockpaperscissors.strategies.Strategies;
import mav.kostas.rockpaperscissors.utils.scanner.IntScanner;
import mav.kostas.rockpaperscissors.utils.scanner.StringScanner;

import static java.lang.System.out;
import static mav.kostas.rockpaperscissors.rules.ResultConstants.TIE;

/**
 * An implementation of a Rock Paper Scissors game.
 */
public class RockPaperScissorsGame extends Game {
    @Override
    protected void printHello() {
        out.println("***********************************************");
        out.println("* Welcome to a game of Rock, Paper, Scissors! *");
        out.println("***********************************************");
        out.println();
    }

    @Override
    protected void printRoundStart(int round) {
        out.println("Round " + round);
    }

    @Override
    protected void printRoundStats(int winner) {
        players.forEach(p -> out.println(p.getName() + " played " + p.getLastMove()));
        if (winner != TIE) {
            out.println("-> " + players.get(winner).getName() + " wins!");
        } else {
            out.println("-> It's a tie!");
        }
        out.println();
    }

    @Override
    protected void printResults() {
        out.println("******* Final Score *******");
        players.forEach(p -> out.println(p.getName() + " won " + p.getScore() + " time(s)."));
        if (players.get(0).getScore() == players.get(1).getScore()) {
            out.println("-> It's a tie!");
        } else {
            out.println("-> The winner is " + players.get(0).getName() + "!");
        }
        out.println();
        out.println("Thanks for playing!");
    }


    /**
     * By default, the game is real player vs computer.
     * <p>
     * More cases and strategies can be tested, like this:
     * <p>
     * players.add(new RealPlayer("Player A", Strategies.RANDOM))
     * players.add(new RealPlayer("Player B", Strategies.RANDOM))
     */
    @Override
    protected void setPlayers() {
        out.println("What is your name?");
        String name = new StringScanner().next();
        Player realPlayer = new RealPlayer(name, Strategies.INPUT);

        players.add(realPlayer);
        players.add(Computer.getInstance());
    }

    @Override
    protected void setNumRounds() {
        out.println("How many rounds do you want to play?");
        numRounds = new IntScanner().next();
        out.println();
    }

    @Override
    protected void setRules() {
        rules = new RockPaperScissorsRules();
    }
}
