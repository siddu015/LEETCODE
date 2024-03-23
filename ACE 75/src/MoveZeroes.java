public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1)
            return;

        int nonZeroIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        while(nonZeroIndex < nums.length)
            nums[nonZeroIndex++] = 0;
    }
}
