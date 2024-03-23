public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0, netGain = 0;

        for (int j : gain) {
            netGain += j;
            max = Math.max(netGain, max);
        }

        return max;
    }
}
