package mav.kostas.rockpaperscissors.utils.scanner;

/**
 * A bounded non-negative integer scanner.
 * <p>
 * Accepts the user input if it is between 0 and max.
 */
public class BoundedIntScanner extends SafeScanner<Integer> {
    private final int max;

    public BoundedIntScanner(int max) {
        this.max = max;
    }

    @Override
    public Integer readNextOrThrow() {
        int nonNegativeInt = Integer.parseInt(sc.nextLine());
        if (nonNegativeInt < 0 || nonNegativeInt > max) {
            throw new IllegalArgumentException("Input cannot be negative or bigger than " + max);
        }
        return nonNegativeInt;
    }
}
