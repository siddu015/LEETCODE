public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];

        int LeftProduct = 1;
        for(int i=0; i < len; i++) {
            result[i] = LeftProduct;
            LeftProduct *= nums[i];
        }

        int RightProduct = 1;
        for(int i = len - 1; i >= 0; i--) {
            result[i] *= RightProduct;
            RightProduct *= nums[i];
        }

        return result;
    }
}
