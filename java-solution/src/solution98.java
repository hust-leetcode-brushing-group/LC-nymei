//validate binary search tree
public class solution98 {
	public boolean isValidBST(TreeNode root) {
    	return helper(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }
    
    public boolean helper(TreeNode root, double min, double max) {
    	if(root == null)	return true;
    	if(root.val <= min || root.val >= max)	return false;
    	return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
}
