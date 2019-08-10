//minimum depth of a tree
public class solution111 {
	public int minDepth(TreeNode root) {
        if(root == null) {
        	return 0;
        }
        if(root.left != null && root.right == null) {
        	return 1 + minDepth(root.left);
        }
        if(root.left == null && root.right != null) {
        	return 1 + minDepth(root.right);
        }
        else
        	return 1 + Math.min(minDepth(root.left),minDepth(root.right));
    }
}
