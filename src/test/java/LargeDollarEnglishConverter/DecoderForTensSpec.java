package LargeDollarEnglishConverter;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by jaymilnamow on 6/11/16.
 */

public class DecoderForTensSpec {

    @Test
    public void decoderForTensTest() {
        DecoderForTens test = new DecoderForTens();
        String expectedString = "Seventy";
        String actualString = test.decoderForTens(7);
        assertEquals("should return the String 'Seventy'",expectedString,actualString);

    }

}
