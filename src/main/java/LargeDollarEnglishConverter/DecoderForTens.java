package LargeDollarEnglishConverter;

/**
 * Created by jaymilnamow on 6/11/16.
 */

public class DecoderForTens {

    public String decoderForTens(int input) {
        String numberAsString = Integer.toString(input);
        return numberAsString.replace("2","Twenty").replace("3","Thirty").replace("4","Forty").replace("5","Fifty").replace("6","Sixty").replace("7","Seventy").replace("8","Eighty").replace("9","Ninety");
    }

}
