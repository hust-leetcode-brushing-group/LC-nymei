//combination sum II
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution40 {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, list, candidates, target, 0);
        return result;
    }
    
    public void backtrack(List<List<Integer>> result, List<Integer> list, int[] candidates, 
			int target, int index) {
		int sum = 0;
		for(int x: list) {
			sum += x;
		}
		if(sum == target) {
			result.add(new ArrayList<>(list));
		}
		else {
			for(int i = index; i < candidates.length; i++) {
				if(sum + candidates[i] > target)	continue;
                if(i > index && candidates[i] == candidates[i-1]) continue; 
				list.add(candidates[i]);
				backtrack(result, list, candidates, target, i + 1);
				list.remove(list.size() - 1);
			}
		}
	}
}
