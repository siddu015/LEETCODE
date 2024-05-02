public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if(nums.length >= 2 && nums[nums.length - 1] > nums[nums.length - 2])
            return nums.length - 1;

        if(nums.length >= 2 && nums[0] > nums[1])
            return 0;

        int left = 0, right = nums.length - 1;
        while(left < right) {
            var mid = left + (right - left) / 2;

            if(nums[mid] < nums[mid + 1])
                left = mid + 1;
            else
                right = mid;
        }

        return left;
    }
}
