import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class NumberRecentCalls {
    private LinkedList<Integer> rqst;
    public void RecentCounter() {
        this.rqst = new LinkedList<>();
    }

    public int ping(int t) {
        rqst.add(t);
        while(rqst.peek() < t - 3000)
            rqst.pollFirst();

        return rqst.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */