import java.util.ArrayList;
import java.util.List;
// preorder traversal
public class solution144 {
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
		if(root == null) {
        	return result;
        }
		result.add(root.val);
        result.addAll(preorderTraversal(root.left));
		result.addAll(preorderTraversal(root.right));
		return result;
    }
}
