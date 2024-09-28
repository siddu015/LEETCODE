public class RemoveDuplicates {
    public void removeDuplicates(int[] nums) {
        if (nums.length == 0) return;

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex])
                nums[++uniqueIndex] = nums[i];
        }

    }
}
