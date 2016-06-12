package LargeDollarEnglishConverter;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by jaymilnamow on 6/11/16.
 */

public class SplitNumberIntoSmallerPartsSpec {

    SplitNumberIntoSmallerParts test = new SplitNumberIntoSmallerParts();
    static String[] testArray = {};

    @Test
    public void splitNumberByCommasTest() {
        testArray = test.splitNumberByCommas("1,111,111,111");

        String expectedString = "111";
        String actualString = testArray[3];
        assertEquals(expectedString,actualString);
    }

    @Test
    public void numberSplitIntoSingleIntegersTest() {
        testArray = test.numberSplitIntoSingleIntegers("111");

        String expectedString = "1";
        String actualString = testArray[1];
        assertEquals(expectedString,actualString);


    }




}
