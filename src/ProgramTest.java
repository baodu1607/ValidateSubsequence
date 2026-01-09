import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ProgramTest {
    @Test
    public void TestCase1() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10);
        assertEquals(true, Main.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase2() {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        assertEquals(true, Main.isValidSubsequence(array, sequence));
    }

    @Test
    public void TestCase3() {
        var array = Arrays.asList(1, 1, 1, 1, 1);
        var sequence = Arrays.asList(1, 1, 1);
        assertEquals(true, Main.isValidSubsequence(array, sequence));
    }
}
