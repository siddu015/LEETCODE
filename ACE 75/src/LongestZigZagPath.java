public class LongestZigZagPath {
//    public int longestZigZag(TreeNode root) {
//        return Math.max(
//                longestZigZag(root.left, 1, 0, true),
//                longestZigZag(root.right, 1, 0, false)
//        );
//    }
//    private int longestZigZag(TreeNode root, int zigzag, int max, boolean isLeft) {
//        if(root == null) return 0;
//
//        if(root.left == null && root.right == null) return max;
//
//        int leftZigZag = !isLeft && root.left != null ? zigzag + 1 : 1;
//        int rightZigZag = isLeft && root.right != null ? zigzag + 1 : 1;
//
//        int leftMaxZigZag = longestZigZag(root.left, leftZigZag, Math.max(max, leftZigZag), true);
//        int rightMaxZigZag = longestZigZag(root.right, rightZigZag, Math.max(max, rightZigZag), false);
//
//        return Math.max(leftMaxZigZag, rightMaxZigZag);
//    }

}
