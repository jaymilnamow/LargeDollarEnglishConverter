package LargeDollarEnglishConverter;

import static javafx.scene.input.KeyCode.M;

/**
 * Created by jaymilnamow on 6/11/16.
 */
public class IntegerEnglishTranslationController {

    public void Run(String input) {

        ConvertToCurrencyFormat convertToCurrencyFormat = new ConvertToCurrencyFormat();

        convertToCurrencyFormat.reformatNumberToUSD(input);

    }

}
