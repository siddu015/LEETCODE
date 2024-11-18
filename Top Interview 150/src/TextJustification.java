import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int maxlength = 0, noOfWords = 0, space = 0;
        String[] collect = new String[10];

        List<String> result = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {

            if(maxlength + space + words[i].length() <= maxWidth && i == words.length - 1) {
                collect[noOfWords++] = words[i];
                maxlength += words[i].length();

                StringBuilder line = new StringBuilder();

                for(int j = 0; j < noOfWords; j++) {
                    line.append(collect[j]);
                    if(j <= noOfWords - 2) {
                        line.append(" ");
                    }
                }

                int lastLineSpace = (maxWidth - (maxlength + space));
                line.append(" ".repeat(Math.max(0, lastLineSpace)));
                result.add(line.toString());
                break;
            }

            if(maxlength + space + words[i].length() < maxWidth) {
                collect[noOfWords++] = words[i];
                maxlength += words[i].length();
                space++;
            }
            else if(maxlength + space + words[i].length() == maxWidth) {
                collect[noOfWords++] = words[i];
                maxlength += words[i].length();
            }
            else {
                StringBuilder line = new StringBuilder();
                space =  space + ( maxWidth - maxlength - space);
                if(noOfWords == 1) {
                    line.append(collect[0]);
                    line.append(" ".repeat(Math.max(0, space)));
                    maxlength = 0; space = 0; noOfWords = 0;
                }
                else {
                    int eachSpace = space/(noOfWords - 1 );
                    if(space%2 != 0 && (space - noOfWords) > 0)
                        eachSpace++;

                    int lastSpace = space - (eachSpace * (noOfWords - 2));

                    for(int j = 0; j < noOfWords; j++) {
                        line.append(collect[j]);
                        if(j <= noOfWords - 3) {
                            line.append(" ".repeat(Math.max(0, eachSpace)));
                        }
                        if(j == noOfWords - 2) {
                            line.append(" ".repeat(Math.max(0, lastSpace)));
                        }
                    }
                    maxlength = 0; space = 0; noOfWords = 0;
                }
                result.add(line.toString());
                i--;
            }
        }
        return result;
    }
}
