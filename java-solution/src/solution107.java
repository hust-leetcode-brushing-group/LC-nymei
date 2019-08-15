import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class solution107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        System.out.println(level.size());
        while(!level.isEmpty() && level.get(0) != null) {
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
        Collections.reverse(result);
        return result;
    }
}
