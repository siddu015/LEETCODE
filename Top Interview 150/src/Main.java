import java.util.*;

public class Main {
    public static int inv = 0;

    public static void main(String[] args) {

        int[] nums = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};

        lengthOfLongestSubstring("au");
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())
            return 0;
        if(s.length() == 1)
            return 1;


        Set<Character> set = new HashSet<>();
        int count = 0, result = 0;

        for(var c: s.toCharArray()) {
            if(set.contains(c)) {
                result = Math.max(result, count);
                count = 1;
                set.clear();
                set.add(c);
            } else {
                set.add(c);
                count++;
            }
        }


        return Math.max(result, count);
    }










}
