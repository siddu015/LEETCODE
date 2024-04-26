

public class PathSumIII {
//    public int pathSum(TreeNode root, int targetSum) {
//        int[] ans = {0};
//        Map<Integer, Integer> prefixSum = new HashMap<>();
//        pathSum(root, prefixSum, targetSum, 0, ans);
//        return ans[0];
//    }
//
//    private void pathSum(TreeNode root,Map<Integer, Integer> prefixSum, int targetSum, int currSum, int[] ans) {
//        if(root == null)
//            return;
//
//        currSum += root.val;
//
//        if(currSum == targetSum)
//            ans[0]++;
//
//        ans[0] += prefixSum.getOrDefault(currSum - targetSum, 0);
//
//        prefixSum.put(currSum, prefixSum.getOrDefault(currSum, 0) + 1);
//
//        pathSum(root.left, prefixSum, targetSum, currSum, ans);
//        pathSum(root.right, prefixSum, targetSum, currSum, ans);
//
//        prefixSum.put(currSum, prefixSum.get(currSum) - 1);
//    }
}
