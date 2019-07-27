import java.util.ArrayList;
import java.util.List;

//subsets
public class solution78 {
    public List<List<Integer>> subsets(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>();
    	List<Integer> temp = new ArrayList<>();
    	backtrack(result, temp, nums, 0);
    	return result;
    }
    
    public void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int current) {
    	result.add(new ArrayList<>(temp));
    	for(int i = current; i < nums.length; i++) {
    		temp.add(nums[i]);
    		backtrack(result, temp, nums, i + 1);
    		temp.remove(temp.size() - 1);
    	}
    }
}
