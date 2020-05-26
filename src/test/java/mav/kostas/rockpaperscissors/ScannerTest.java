package mav.kostas.rockpaperscissors;

import mav.kostas.rockpaperscissors.utils.scanner.BoundedIntScanner;
import mav.kostas.rockpaperscissors.utils.scanner.SafeScanner;
import org.junit.Assert;
import org.junit.Test;

public class ScannerTest extends IOTest {
    @Test
    public void BoundedIntScannerInvalidInputTest() {
        final int MAX = 5;
        // a correct input is required to end the loop
        final String CORRECT_INPUT = String.valueOf(MAX);
        String[] wrongInputs = {"-1", "A", "", "  ", "6", "1.5", CORRECT_INPUT};

        // hacky way of repeating "Invalid!\n> " multiple times
        // String::repeat can be used on Java 11
        final String expectedOutput = "> " +
                new String(new char[wrongInputs.length - 1])
                        .replace("\0", "Invalid!" + System.lineSeparator() + "> ");

        mockInput(wrongInputs);
        SafeScanner<Integer> sc = new BoundedIntScanner(MAX);
        sc.next();

        Assert.assertEquals(mockedOut.toString(), expectedOutput);
    }

    @Test
    public void BoundedIntScannerCorrectInputTest() {
        final int MAX = 5;
        String[] correctInputs = {"0", "1", "2", "3", "4", "5"};

        mockInput(correctInputs);
        SafeScanner<Integer> sc = new BoundedIntScanner(MAX);
        sc.next();

        Assert.assertEquals(mockedOut.toString(), "> ");
    }
}
