package mav.kostas.rockpaperscissors.utils.scanner;

/**
 * A string scanner that accepts non-empty strings.
 */
public class StringScanner extends SafeScanner<String> {
    @Override
    public String readNextOrThrow() {
        String nonEmptyString = sc.nextLine();
        if (nonEmptyString.isEmpty()) {
            throw new IllegalArgumentException("Input cannot be empty");
        }
        return nonEmptyString;
    }
}
