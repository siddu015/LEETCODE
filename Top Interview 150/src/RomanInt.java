import java.util.HashMap;

public class RomanInt {
    public int romanToInt1(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int result = 0;
        int len = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I' && i < len - 1) {
                if(s.charAt(i+1)=='V') {
                    result += 4;
                    i++; continue;
                }
                if(s.charAt(i+1)=='X') {
                    result += 9;
                    i++; continue;
                }
            }

            if (s.charAt(i) == 'X' && i < len - 1) {
                if(s.charAt(i+1)=='L') {
                    result += 40;
                    i++; continue;
                }
                if(s.charAt(i+1)=='C') {
                    result += 90;
                    i++; continue;
                }
            }

            if (s.charAt(i) == 'C' && i < len - 1) {
                if(s.charAt(i+1)=='D') {
                    result += 40;
                    i++; continue;
                }
                if(s.charAt(i+1)=='M') {
                    result += 90;
                    i++; continue;
                }
            }

            result += roman.get(s.charAt(i));
        }

        return result;
    }

    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int result = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            int currentVal = roman.get(s.charAt(i));

            if (i < len - 1 && currentVal < roman.get(s.charAt(i + 1))) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }

        return result;
    }

}
