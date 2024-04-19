import java.util.HashMap;
import java.util.Map;

public class BTMaxLevelSum {
//    public int maxLevelSum(TreeNode root) {
//        Map<Integer, Integer> levelSum = new HashMap<>();
//        maxLevelSum(root, 0, levelSum);
//
//        int max = Integer.MIN_VALUE;
//        int depth = 1;
//        int maxDepth = 0;
//        for (var entry : levelSum.entrySet()) {
//            int sumValue = entry.getValue();
//            if (sumValue > max) {
//                max = sumValue;
//                maxDepth = depth;
//            }
//            depth++;
//        }
//
//        return maxDepth;
//    }
//
//    private void maxLevelSum(TreeNode root, int depth, Map<Integer, Integer> levelSum) {
//        if (root == null) return;
//
//        if (!levelSum.containsKey(depth)) {
//            levelSum.put(depth, root.val);
//        } else {
//            int currentValue = levelSum.get(depth);
//            levelSum.put(depth, currentValue + root.val);
//        }
//
//        maxLevelSum(root.right, depth + 1, levelSum);
//        maxLevelSum(root.left, depth + 1, levelSum);
//    }
}

