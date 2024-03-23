public class Vowels {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int start = 0, end = s.length() - 1;

        while(start < end) {
            while (start < end && !checkVowel(word[start])) {
                start++;
            }

            while (start < end && !checkVowel(word[end])) {
                end--;
            }

            char ch = word[start];
            word[start] = word[end];
            word[end] = ch;

            start++;
            end--;
        }

        return new String(word);
    }

    private boolean checkVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
