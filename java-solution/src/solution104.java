//maximum depth of binary tree
public class solution104 {
	public int maxDepth(TreeNode root) {
        if(root == null)
        	return 0;
        if(root.left != null && root.right == null) 
        	return 1 + maxDepth(root.left);
        if(root.left == null && root.right != null)
        	return 1 + maxDepth(root.right);
        else
        	return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
