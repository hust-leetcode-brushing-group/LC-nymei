import java.util.ArrayList;
import java.util.List;

//Unique Binary Search Trees II
public class solution95 {
    public List<TreeNode> generateTrees(int n) {
        if(n == 0)	return new ArrayList<>();
        return helper(1,n);
    }
    
    private List<TreeNode> helper(int a, int b){
    	List<TreeNode> result = new ArrayList<>();
    	if(a > b)	{
    		result.add(null);
    		return result;}
    	for(int i = a; i <= b; i++) {
    		List<TreeNode> left = helper(a,i - 1);
    		List<TreeNode> right = helper(i + 1, b);
    		for(TreeNode l: left){
                for(TreeNode r: right){
                    TreeNode curr = new TreeNode(i);
                    curr.left=l;
                    curr.right=r;
                    result.add(curr);
                }
            }
    	}
    	return result;
    }
}
