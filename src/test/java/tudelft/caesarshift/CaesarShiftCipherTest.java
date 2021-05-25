package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "{0}: {1}, {2} = {3}")
    @CsvSource({
            // One character, not passing through a or z
            "'one-char-not-passing-a-or-z', 'a', '2', 'c'", "'one-char-not-passing-a-or-z', 'k', '2', 'm'",
            // Multiple characters
            "'multiple-characters', 'abc', '2', 'cde'"
    })
    public void testAlgorithm(String partition, String message, int shift, String expectedResult) {
        String result = new CaesarShiftCipher().CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
