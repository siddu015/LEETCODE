import java.util.Arrays;
import java.util.Hashtable;

public class RankTransform {
    public int[] arrayRankTransform(int[] arr) {
        int len = arr.length;
        if (len == 0) return new int[0];

        int[] temp = Arrays.copyOf(arr, len);
        Arrays.sort(temp);

        Hashtable<Integer, Integer> hash = new Hashtable<>();
        int rank = 1;
        for (int i = 0; i < len; i++) {
            if (!hash.containsKey(temp[i])) {
                hash.put(temp[i], rank++);
            }
        }

        int[] rankArr = new int[len];
        for (int i = 0; i < len; i++) {
            rankArr[i] = hash.get(arr[i]);
        }

        return rankArr;
    }
}