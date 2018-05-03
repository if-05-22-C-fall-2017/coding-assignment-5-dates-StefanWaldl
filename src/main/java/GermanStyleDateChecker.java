import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {

    public static Matcher getMatcher(String dateString) {
        return Pattern
                .compile("^(([0-1]?[0-9])|(30|31))[.\\- ]((1[0-2])|(0?[0-9]))[.\\- ]((((19)|(2[0-9]))[0-9][0-9])|([1-9][0-9]))$")
                .matcher(dateString);
    }

}
