import java.util.Arrays;
import java.util.stream.Collectors;

public class StringReverse {
    public static String reverseWords(String s) {
        return Arrays.asList(s.split(" ")).reversed().stream().filter(c -> !c.isEmpty()).collect(Collectors.joining(" "));
    }
}
