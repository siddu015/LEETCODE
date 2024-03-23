public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        s = s.toLowerCase();
        int i, count = 0, max;

        //Getting number of vowels in first k elements
        for(i = 0; i < k; i++){
            if(checkVowel(s.charAt(i)))
                count++;
        }
        max = count;

        //Updating the max vowels in a substring if there are any
        for(i = k; i < s.length(); i++) {
            if(checkVowel(s.charAt(i - k)))
                count--;
            if(checkVowel(s.charAt(i)))
                count++;

            max = Math.max(max, count);
        }

        return max;
    }

    private boolean checkVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
