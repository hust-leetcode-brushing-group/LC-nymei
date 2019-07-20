import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//4 sum
public class solution18 {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length - 3; i++) {
			for(int j = i + 1; j < nums.length - 2; j++) {
				int start = j + 1;
				int end = nums.length - 1;
				if(nums[i] + nums[j] + nums[start] + nums[end] > target) {
					int current_end = end;
					while(nums[end] == nums[current_end] && start < end){
                        end = end -1;
                    }
				}
				else if(nums[i] + nums[j] + nums[start] + nums[end] < target) {
					int current_start = start;
					while(nums[start] == nums[current_start] && start < end){
                        start = start + 1;
                    }
				}
				else {
					List<Integer> temp = new ArrayList<>();
					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(nums[start]);
					temp.add(nums[end]);
					result.add(temp);
					int current_end = end;
                    int current_start = start;
					while(nums[end] == nums[current_end] && start < end){
                        end = end -1;
                    }
                    while(nums[start] == nums[current_start] && start < end){
                        start = start + 1;
                    }
				}
				
			}
		}
		return result;
    }
}
