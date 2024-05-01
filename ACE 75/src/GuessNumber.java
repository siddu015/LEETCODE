public class GuessNumber {
    public int guessNumber(int n) {
        int i = 1;
        int j = n;
        while(i <= j) {
            int mid = i + (j - i) / 2;

            int k = guess(mid);
            if(k == 0) return mid;
            if(k == 1)
                i = mid + 1;
            else
                j = mid - 1;
        }

        return -1;
    }

    private int guess(int value) {
       return 0;
    }
}
