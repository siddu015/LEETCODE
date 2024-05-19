public class CountingBits {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        res[0] = 0;

        for (var i = 1; i <= n; i++) {
            var k = i;
            var count = 0;
            while(k != 0) {
                if(k % 2 == 1)
                    count++;
                k = k / 2;
            }
            res[i] = count;
        }

        return res;
    }
}
