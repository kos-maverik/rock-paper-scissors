package mav.kostas.rockpaperscissors.utils.scanner;

/**
 * A non-negative integer scanner.
 */
public class IntScanner extends SafeScanner<Integer> {
    @Override
    public Integer readNextOrThrow() {
        int nonNegativeInt = Integer.parseInt(sc.nextLine());
        if (nonNegativeInt < 0) {
            throw new IllegalArgumentException("Input cannot be negative");
        }
        return nonNegativeInt;
    }
}
