public class RotateArray {
    public void rotate(int[] nums, int k) {
        int numsLength = nums.length;
        if (numsLength == 0 || k == 0) return;

        // Handle cases where k is larger than the array length
        k = k % numsLength;

        // Step 1: Reverse the whole array
        reverse(nums, 0, numsLength - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements from k to end
        reverse(nums, k, numsLength - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
