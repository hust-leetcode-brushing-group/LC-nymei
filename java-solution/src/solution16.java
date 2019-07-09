//3 sum closest
import java.util.Arrays;

public class solution16 {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[2];
		for(int i = 0; i < nums.length - 2;i++) {
			if(i != 0 && nums[i] == nums[i-1])  continue;
            int first_num = nums[i];
			int start = i + 1;
			int end = nums.length - 1;
			while(start < end) {
				int sum = first_num + nums[start] + nums[end];
				
				if(sum == target)
					return target;
                
                if(Math.abs(sum - target) < Math.abs(result-target))
                	result = sum;
				if(sum > target) {
					int current_end = end;
                    while(nums[end] == nums[current_end] && start < end){
                        end = end -1;
                    }
				}
				else {
					int current_start = start;
                    while(nums[start] == nums[current_start] && start < end){
                        start = start + 1;
                    }
				}
			}
		}
        return result;
    }
}
