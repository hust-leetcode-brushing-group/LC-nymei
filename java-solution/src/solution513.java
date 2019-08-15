import java.util.LinkedList;
import java.util.Queue;

// find bottom left value
public class solution513 {
	public int findBottomLeftValue(TreeNode root) {
        if(root.right == null && root.left == null) {
        	return root.val;
        }
        int result = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(null);
        q.add(root);
        while(!q.isEmpty()) {
        	TreeNode p = q.poll();
        	if(p != null) {
        		if(p.left != null) {
        			q.add(p.left);
        		}
        		if(p.right != null) {
        			q.add(p.right);
        		}
        	}
        	else if(!q.isEmpty()) {
        		q.add(null);
        		result = q.peek().val;
        	}
        }
        return result;
    }
}