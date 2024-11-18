public class FirstOccurence {
    public int strStr(String haystack, String needle) {
        int lenN = needle.length();
        int lenH = haystack.length();

        int preferredCheckLength = lenH - lenN + 1;
        for(int i = 0; i < preferredCheckLength; i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                if(haystack.substring(i, i + lenN).equals(needle)) {
                    return i;
                }
            }
        }

        return -1;
    }
}
