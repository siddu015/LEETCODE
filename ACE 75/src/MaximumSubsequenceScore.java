import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumSubsequenceScore {
    public long maxScore(int[] sumArr, int[] productArr, int k) {
        var n = sumArr.length;
        Integer[] indexQueue = new Integer[n];
        for(var i = 0; i < n; i++)
            indexQueue[i] = i;

        Arrays.sort(indexQueue, (a, b) -> Integer.compare(productArr[b], productArr[a]));

        PriorityQueue<Integer> sumPriorityQueue = new PriorityQueue<>();
        int sum = 0;
        int result = -1;
        for(var index = 0; index < n; index++) {
            var sortedIndex = indexQueue[index];
            sumPriorityQueue.add(sumArr[sortedIndex]);
            sum += sumArr[sortedIndex];

            if(sumPriorityQueue.size() > k)
                sum -= sumPriorityQueue.poll();
            if(sumPriorityQueue.size() == k)
                result = Math.max(result, sum * productArr[indexQueue[index]]);
        }

        return result;
    }
}
