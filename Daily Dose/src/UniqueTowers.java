import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueTowers {
    public long maximumTotalSum(int[] maximumHeight) {
        Arrays.sort(maximumHeight);

        long maxSum = 0;
        int lastAssignedHeight = Integer.MAX_VALUE;

        for (int i = maximumHeight.length - 1; i >= 0; i--) {
            int height = Math.min(maximumHeight[i], lastAssignedHeight - 1);

            if (height <= 0) {
                return -1;
            }

            maxSum += height;
            lastAssignedHeight = height;
        }

        return maxSum;
    }
}
