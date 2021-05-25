package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {
    @Test
    public void emptyString() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("");
        Assertions.assertEquals("", result);
    }

    @Test
    public void stringNoMirror() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abcdef");
        Assertions.assertEquals("", result);
    }

    @Test
    public void stringAlmostMirrorCase() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abcdeBA");
        Assertions.assertEquals("", result);
    }

    @Test
    public void mirrorNonOverlapping() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abcdefba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void mirrorOverlappingEven() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abCCba");
        Assertions.assertEquals("abCCba", result);
    }

    @Test
    public void mirrorOverlappingOdd() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("abCDCba");
        Assertions.assertEquals("abCDCba", result);
    }

    @Test
    public void mirrorButNotAtTheBeginingAndEnd() {
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("xabCDCbaY");
        Assertions.assertEquals("", result);
    }
}
