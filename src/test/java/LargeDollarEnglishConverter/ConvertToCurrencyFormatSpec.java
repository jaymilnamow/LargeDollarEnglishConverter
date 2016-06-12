package LargeDollarEnglishConverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jaymilnamow on 6/11/16.
 */

public class ConvertToCurrencyFormatSpec {

    @Test
    public void reformatNumberToUSDTest(){
    ConvertToCurrencyFormat test = new ConvertToCurrencyFormat();
        String expectedString = "1,111,111,111";
        String actualString = test.reformatNumberToUSD("1111111111");
        assertEquals("expected value should be the test number with commas",expectedString,actualString);
    }

}
