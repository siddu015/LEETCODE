import java.util.HashMap;
import java.util.Hashtable;

public class IntToRoman {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        Hashtable<Integer, String> map = new Hashtable<>();

        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");

        while (num > 0) {
            int max = 0;
            for(var value: map.keySet()){
                if(num - value < 0)
                    break;
                max = value;
            }

            roman.append(map.get(max));
            num -= max;
        }

        return roman.toString();
    }
}
