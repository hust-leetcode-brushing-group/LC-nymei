import java.util.ArrayList;
import java.util.List;

//permutation unique
public class solution47 {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		boolean[] contain = new boolean[nums.length];
		backtrack(result, list, nums, contain);
		return result;
    }
	public void backtrack(List<List<Integer>> result, List<Integer> list, int[] nums, boolean[] contain) {
		if(list.size() == nums.length)
			result.add(new ArrayList<>(list));
        for(int i = 0; i < nums.length; i++){
			if(contain[i] || (i > 0 && nums[i] == nums[i-1] && !contain[i - 1]))
                continue;
			list.add(nums[i]);
			contain[i] = true;
			backtrack(result, list, nums, contain);
			list.remove(list.size() - 1); 
			contain[i] = false;
        }
	}
}
