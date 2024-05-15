import java.util.Stack;

public class temp {
    public String decodeString(String s) {
        Stack<Integer> stackI = new Stack<>();
        Stack<Character> stackS = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;

        for(char c: s.toCharArray()) {
            if(Character.isDigit(c)) {
                n = n * 10 + (c - '0');
                stackI.push(n);
            }
            else {
                stackS.push(c);
                n = 0;
            }
        }

        var value = 0;
        char c;

        while(!stackS.isEmpty() && !stackI.isEmpty()) {
            value = stackI.pop();
            c = stackS.pop();
            for(var i = 0; i < value; i++)
                sb.append(c);
        }

        return sb.reverse().toString();
    }
}
