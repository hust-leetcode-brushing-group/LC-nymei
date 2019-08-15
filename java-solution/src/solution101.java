//symmetric tree
public class solution101 {
	public boolean isSymmetric(TreeNode root) {
        return helper(root, root);
    }
	
	private boolean helper(TreeNode t1, TreeNode t2) {
		if(t1 == null && t2 == null)	return true;
		if(t1 == null || t2 == null)	return false;
		return t1.val == t2.val && helper(t1.left, t2.right) && helper(t2.left, t1.right);
	}
}
