import java.util.ArrayList;
import java.util.List;

//postorder traversal
public class solution145 {
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
		if(root == null) {
        	return result;
        }
        result.addAll(postorderTraversal(root.left));
		result.addAll(postorderTraversal(root.right));
		result.add(root.val);
        return result;
    }
}
