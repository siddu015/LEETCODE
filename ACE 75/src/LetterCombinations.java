import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    private static final char[][] telephone = {{},{},{'a','b','c'},{'d','e','f'},
                                                    {'g','h','i'}, {'j','k','l'},
                                                    {'m','n','o'}, {'p','q','r','s'},
                                                    {'t','u','v'},{'w','x','y','z'}};

    public List<String> letterCombinations(String digits) {
        var noOfCombinations = 1;

        ArrayList<Integer> values = new ArrayList<>();

        for(var d : digits.toCharArray())
            values.add(Integer.parseInt(String.valueOf(d)));

        List<String> combinations = new ArrayList<>();

        getCombinations(values, combinations, 0, "");

        return combinations;

    }

    private void getCombinations(ArrayList<Integer> values, List<String> combinations, int present, String prevString) {
        if(values.size() == present) return;

        var value = values.get(present);

        for(var i = 0; i < telephone[value].length; i++) {
            char c = telephone[value][i];
            getCombinations(values, combinations, present+1, prevString + c);
            var presentString = prevString + c;
            if(present == values.size() - 1)
                combinations.add(presentString);
        }
    }
}
