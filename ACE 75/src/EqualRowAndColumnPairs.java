import java.util.HashMap;

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        int len = grid.length, count = 0;

        for (int[] ints : grid) {
            for (int j = 0; j < len; j++) {
                boolean isEqual = true;
                for (int k = 0; k < len; k++) {
                    if (ints[k] != grid[k][j]) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) count++;
            }
        }

        return count;
    }
}
