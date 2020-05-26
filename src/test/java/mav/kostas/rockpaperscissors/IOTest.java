package mav.kostas.rockpaperscissors;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * A parent class used for mocking the input and output streams.
 */
public class IOTest {
    protected final ByteArrayOutputStream mockedOut = new ByteArrayOutputStream();

    public void mockInput(String... s) {
        System.setIn(new ByteArrayInputStream(String.join("\n", s).getBytes()));
    }

    @Before
    public void mockOutput() {
        System.setOut(new PrintStream(mockedOut));
    }

    @After
    public void restoreStreams() {
        System.setIn(System.in);
        System.setOut(System.out);
    }
}
