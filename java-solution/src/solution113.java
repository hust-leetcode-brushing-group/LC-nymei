import java.util.ArrayList;
import java.util.List;

//path sum II
public class solution113 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(root, result, temp, sum);
        return result;
    }
	
	public void helper(TreeNode root, List<List<Integer>> result, List<Integer> temp, int sum) {
        if(root == null)
			return;
		if(root.left == null && root.right == null) {
			if(sum == root.val) {
				temp.add(root.val);
				result.add(new ArrayList<>(temp));
                temp.remove(temp.size() - 1);
			}
			return;
		}
		else {
			temp.add(root.val);
			helper(root.left, result, temp, sum - root.val);
			helper(root.right, result, temp, sum - root.val);
			temp.remove(temp.size() - 1);
			return;
		}	
	}
}
