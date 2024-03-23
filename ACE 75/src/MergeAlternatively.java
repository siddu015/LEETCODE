public class MergeAlternatively {
    public static String merge(String word1, String word2) {

        StringBuilder result = new StringBuilder();
        int length1 = Math.min(word1.length(), word2.length());
        int length2 = Math.max(word1.length(), word2.length());

        for(int i = 0; i < length1; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        var leftWord = word1.length() > word2.length() ? word1 : word2;

        for(int i = length1; i < length2; i++) {

            result.append(leftWord.charAt(i));
        }


        return result.toString();

    }


}
