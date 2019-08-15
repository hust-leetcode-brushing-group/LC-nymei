//construct binary tree from pre and inorder traversal
public class solution105 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }
	
	public TreeNode construct(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
		if(preStart > preEnd || inStart > inEnd)	return null;
		int val = preorder[preStart];
		TreeNode p = new TreeNode(val);
		int k = search(inorder, val);
		p.left = construct(preorder, inorder, preStart+1, preStart+(k-inStart), inStart, k-1);
	    p.right= construct(preorder, inorder, preStart+(k-inStart)+1, preEnd, k+1 , inEnd);
	 
		return p;
	}
	
	public int search(int[] inorder, int val) {
		for(int i = 0; i < inorder.length; i++) {
			if(val == inorder[i])
				return i;
		}
		return 0;
	}
}
