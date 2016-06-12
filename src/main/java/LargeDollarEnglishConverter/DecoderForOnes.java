package LargeDollarEnglishConverter;

/**
 * Created by jaymilnamow on 6/11/16.
 */
public class DecoderForOnes {

    public String onesDecoderArray[] = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

    public String decoderForOnes(int input) {

        return onesDecoderArray[input -1];

    }

}
