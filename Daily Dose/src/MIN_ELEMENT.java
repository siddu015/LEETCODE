public class MIN_ELEMENT {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(var num: nums) {
            int sum = 0;
            while(num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            min = Math.min(min, sum);
        }

        return min;
    }
}
