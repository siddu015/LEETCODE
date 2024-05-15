public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        var count = 0;

        var n = 0;
        for(var i = 0; i < text2.length(); i++) {
            var c = text2.charAt(i);
            for(var j = n; j < text1.length(); j++)
                if(text1.charAt(j) == c) {
                    count++;
                    n = j + 1;
                    break;
                }
        }

        return count;
    }
}
