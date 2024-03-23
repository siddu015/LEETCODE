public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int leftSum = 0, totalSum = 0;

        for(var num: nums)
            totalSum += num;

        for (int i = 0; i < nums.length; leftSum += nums[i++]) {
            if(leftSum * 2 == totalSum - nums[i])
                return i;
        }

        return -1;
    }
}
