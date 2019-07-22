import java.util.ArrayList;
import java.util.List;

//TreeNode Level Order Traverse
public class solution102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        while(!level.isEmpty() || level.get(0) != null) {
        	List<TreeNode> next = new ArrayList<>();
            List<Integer> current = new ArrayList<>();

            for (TreeNode node : level){
                current.add(node.val);
                if (node.left != null) next.add(node.left);
                if (node.right != null) next.add(node.right);
            }
            result.add(current);
            level = next;
        }
        return result;
    }
}
