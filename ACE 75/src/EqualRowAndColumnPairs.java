import java.util.HashMap;

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int n = grid.length, result = 0;

        HashMap<Long, Integer> rows= new HashMap<>();

        for (int[] values : grid) {
            long t1 = 0;
            for (int val: values)
                t1 = t1 * 10 + val;
            rows.put(t1, rows.getOrDefault(t1, 0) + 1);
        }

        for(int i = 0; i < n; i++) {
            long t2 = 0;
            for (int[] ints : grid) t2 = t2 * 10 + ints[i];

            result += rows.getOrDefault(t2, 0);
        }

        return result;

    }
}
