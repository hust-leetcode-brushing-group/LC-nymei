//Balanced Binary Tree
public class solution110 {
	public boolean isBalanced(TreeNode root) {
        if(root == null)	return true;
        int lefth = height(root.left);
        int righth = height(root.right);
        return Math.abs(righth - lefth) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
	
	public int height(TreeNode root) {
		if(root == null)	return 0;
		return 1 + Math.max(height(root.left), height(root.right));
	}
}	
