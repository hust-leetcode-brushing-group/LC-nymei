import java.util.ArrayList;
import java.util.List;

//TreeNode Inorder Traverse
public class solution94 {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
		if(root == null) {
        	return result;
        }
		result = inorderTraversal(root.left);
		result.add(root.val);
		result.addAll(inorderTraversal(root.right));
		return result;
    }
}
