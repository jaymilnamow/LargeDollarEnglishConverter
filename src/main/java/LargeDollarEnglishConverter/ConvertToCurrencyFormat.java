package LargeDollarEnglishConverter;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by jaymilnamow on 6/11/16.
 */

public class ConvertToCurrencyFormat {

    public String reformatNumberToUSD(String input) {
        double amount = Double.parseDouble(input);
        System.out.println(NumberFormat.getInstance(Locale.US).format(amount));
        return NumberFormat.getInstance(Locale.US).format(amount);
    }
}
