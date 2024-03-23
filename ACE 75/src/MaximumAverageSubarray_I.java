public class MaximumAverageSubarray_I {
    public static double findMaxAverage(int[] nums, int k) {
        int i;
        double max, sum = 0;

        for(i = 0; i < k; i++){
            sum += nums[i];
        }

        max = sum;

        for(i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);
        }

        return max / k;
    }
}
