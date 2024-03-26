public class RemovingStars {
    public String removeStars(String s) {
        int len = s.length();
        StringBuilder temp = new StringBuilder(s);
        int i = 0;
        for(var ch:  s.toCharArray() ) {
            if(ch == '*') {
                temp.deleteCharAt(i);
                temp.deleteCharAt(i-1);
                i -= 2;
            }
            i++;
        }

        return temp.toString();
    }
}
