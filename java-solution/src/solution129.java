//sum root to leaf numbers
public class solution129 {
	public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
	
	public int helper(TreeNode root, int branchsum) {
		if(root == null)	return 0;
		if(root.right == null && root.left == null)	return branchsum + root.val;
		return helper(root.left, root.val * 10) + helper(root.right, root.val * 10);
	}
}
