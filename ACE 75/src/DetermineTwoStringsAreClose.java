import java.util.Arrays;

public class DetermineTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        int[] countOfWord1 = new int[26];
        int[] countOfWord2 = new int[26];

        for(var c: word1.toCharArray())
            countOfWord1[c - 'a']++;

        for(var c: word2.toCharArray())
            countOfWord2[c - 'a']++;

        for(int i = 0; i < 26; i++) {
            if((countOfWord1[i] == 0 && countOfWord2[i] != 0) || (countOfWord1[i] != 0 && countOfWord2[i] == 0))
                return false;
        }

        Arrays.sort(countOfWord1);
        Arrays.sort(countOfWord2);

        for(int i = 0; i < 26; i++) {
            if(countOfWord1[i] != countOfWord2[i])
                return false;
        }

        return true;
    }
}
