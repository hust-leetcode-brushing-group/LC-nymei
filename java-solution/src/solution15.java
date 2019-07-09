//3 sums
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class solution15 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 2;i++) {
			if(i != 0 && nums[i] == nums[i-1])  continue;
            int first_num = nums[i];
			int start = i + 1;
			int end = nums.length - 1;
            
			while(start < end) {
                // System.out.println(i + " " + start + " " + end);
                // System.out.println(nums[i] + " " + nums[start] + " " + nums[end]);
                if(first_num + nums[start] + nums[end] > 0) {
					int current_end = end;
                    while(nums[end] == nums[current_end] && start < end){
                        end = end -1;
                    }
				}
				else if(first_num + nums[start] + nums[end] < 0) {
					int current_start = start;
                    while(nums[start] == nums[current_start] && start < end){
                        start = start + 1;
                    }
				}
				else {
					List<Integer> partial = new ArrayList<>();
					partial.add(first_num);
					partial.add(nums[start]);
					partial.add(nums[end]);
					result.add(partial);
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
