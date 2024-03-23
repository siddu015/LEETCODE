public class StringCompression {
    public int compress(char[] chars) {
        StringBuilder result = new StringBuilder();
        char prev = ' ';
        int count = 0;

        for(var ch: chars) {
            if(prev != ch ){
                if(count > 1)
                    result.append(count);
                result.append(ch);
                count = 1;
            } else
                count++;

            prev = ch;
        }

        if(count > 1) result.append(count);

        char[] chars2 = new char[result.length()];
        for(int i = 0; i < result.length(); i++){
            chars2[i] = result.charAt(i);
        }

        System.arraycopy(chars2, 0, chars, 0, chars2.length);

        return result.length();
    }
}
