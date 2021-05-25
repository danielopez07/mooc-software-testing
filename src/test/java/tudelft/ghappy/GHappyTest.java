package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest(name = "{0}: ({1}) = {2}")
    @CsvSource({
            // no string
            "'no-string','',false",
            // one character string
            "'one-char-string','g',false",
            // two characters string true
            "'two-chars-true','gg',true",
            // two characters string false
            "'two-chars-false','ag',false",
            // three characters false
            "'three-chars','gag',false",
    })
    public void testAlgorithm(String partition, String string, boolean expectedResult) {
        boolean result = new GHappy().gHappy(string);
        Assertions.assertEquals(expectedResult, result);
    }
}
