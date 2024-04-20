public class DeleteNodeBST {
    //    public TreeNode deleteNode(TreeNode root, int key) {
    //        if(root == null) return null;
    //        else if( root.val < key){
    //            root.right = deleteNode(root.right, key);
    //        }
    //        else if(root.val > key){
    //            root.left = deleteNode(root.left, key);
    //        }
    //        else {
    //            if(root.left == null && root.right == null)
    //                return  null;
    //            else if(root.left == null && root.right != null) {
    //                return root.right;
    //            }
    //            else if(root.left != null && root.right == null){
    //                return root.left;
    //            }
    //            else {
    //                var current = root;
    //                current = current.right;
    //                while(current != null && current.left != null) {
    //                    current = current.left;
    //                }
    //                root.val = current.val;
    //                root.right = deleteNode(root.right, root.val);
    //                return root;
    //            }
    //        }
    //        return root;
    //    }
}
