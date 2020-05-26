package mav.kostas.rockpaperscissors.utils.scanner;

import java.util.Scanner;

/**
 * A decorator of the {@link Scanner} class, used for safely discarding invalid input.
 * <p>
 * Prints "Invalid!" on every invalid user input and then it reads again.
 * <p>
 * This class is using a greatly simplified Decorator design pattern.
 * For simplicity, a default value was used for the scanner, instead of a constructor.
 *
 * @param <E> the type of input that is expected.
 */
public abstract class SafeScanner<E> {
    protected Scanner sc = new Scanner(System.in);

    protected abstract E readNextOrThrow() throws IllegalArgumentException;

    public E next() {
        try {
            System.out.print("> ");
            return readNextOrThrow();
        } catch (IllegalArgumentException _) {
            System.out.println("Invalid!");
            return next();
        }
    }
}
