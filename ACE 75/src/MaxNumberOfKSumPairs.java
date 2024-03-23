import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        int len = nums.length;
        int l = 0, r = len - 1, count = 0;
        Arrays.sort(nums);
        while(l < r) {
            if(nums[l] + nums[r] == k) {
                l++;
                r--;
                count++;
            }
            else if (nums[l] + nums[r] > k)
                r--;
            else
                l++;
        }

        return count;
    }
}
