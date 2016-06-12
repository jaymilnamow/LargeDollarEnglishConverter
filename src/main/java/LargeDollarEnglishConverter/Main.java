package LargeDollarEnglishConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by jaymilnamow on 6/11/16.
 */

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s;

        while ((s = in.readLine()) != null) {
//            IntegerEnglishTranslationController integerEnglishTranslationController = new IntegerEnglishTranslationController();
//            integerEnglishTranslationController.Run(s);
            ConvertToCurrencyFormat convertToCurrencyFormat = new ConvertToCurrencyFormat();
            convertToCurrencyFormat.reformatNumberToUSD(s);
            System.out.println(s);
        }
    }
}