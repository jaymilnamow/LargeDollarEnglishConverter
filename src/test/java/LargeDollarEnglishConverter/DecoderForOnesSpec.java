package LargeDollarEnglishConverter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by jaymilnamow on 6/11/16.
 */

public class DecoderForOnesSpec {

    DecoderForOnes test = new DecoderForOnes();

    @Test
    public void decoderForOnesTest() {
        String expectedString = "Five";
        String actualString = test.decoderForOnes(5);
        assertEquals("should convert int 5 to String 'Five'",expectedString,actualString);
    }

    @Test
    public void decoderForOnesTest2() {
        String expectedString = "Fourteen";
        String actualString = test.decoderForOnes(14);
        assertEquals("should convert int 14 to String 'Fourteen'",expectedString,actualString);
    }


}
