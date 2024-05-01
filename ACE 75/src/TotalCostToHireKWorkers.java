import java.util.PriorityQueue;

public class TotalCostToHireKWorkers {
    public long totalCost(int[] costs, int k, int candidates) {
        var i = 0;
        var j = costs.length - 1;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        long totalCost = 0;
        while(k-- > 0) {
            while(pq1.size() < candidates && i <= j)
                pq1.offer(costs[i++]);

            while(pq2.size() < candidates && i <= j)
                pq2.offer(costs[j--]);

            var t1 = !pq1.isEmpty() ? pq1.peek() : Integer.MAX_VALUE;
            var t2 = !pq2.isEmpty() ? pq2.peek() : Integer.MAX_VALUE;

            if (t1 <= t2) {
                totalCost += t1;
                pq1.poll();
            }
            else {
                totalCost += t2;
                pq2.poll();
            }
        }

        return totalCost;
    }
}
