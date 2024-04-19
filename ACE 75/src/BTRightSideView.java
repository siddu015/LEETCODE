
public class BTRightSideView {
//    public List<Integer> rightSideView(TreeNode root) {
//        List<Integer> rightView = new ArrayList<>();
//        rightSideView(root, rightView, 0);
//        return rightView;
//    }
//
//    private void rightSideView(TreeNode root, List<Integer> rightView, int depth) {
//        if (root == null) return;
//
//        // If the current depth is equal to the size of the result list, add the current node's value
//        if (depth == rightView.size()) {
//            rightView.add(root.val);
//        }
//
//        // Traverse the right subtree first, then the left subtree
//        rightSideView(root.right, rightView, depth + 1);
//        rightSideView(root.left, rightView, depth + 1);
//    }
}

