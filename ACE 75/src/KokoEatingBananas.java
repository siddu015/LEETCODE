public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {

        long min = 0;
        for(int i = 1; i < Integer.MAX_VALUE; i++) {
            long k = 0;
            for(var pile: piles) {
                k += pile / i;
                if(pile % i > 0)
                    k++;
            }
            if(k <= h)
                return i;
        }

        return -1;
    }
}
