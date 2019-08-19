//house robber
public class solution198 {
	public int rob(int[] nums) {
		if(nums.length == 1)	return nums[0];
		if(nums.length == 2)	return (nums[0] >= nums[1])? nums[0]: nums[1];
		int[] result = new int[nums.length];
		result[0] = nums[0];
		result[1] = nums[1];
		for(int i = 2; i < nums.length; i++) {
			for(int j = 0; j < i - 1; j++) {
				if(result[j] + nums[i] > result[i]) {
					result[i] = result[j] + nums[i];
				}
			}
		}
		return (result[result.length - 1] >= result[result.length - 2])? 
				result[result.length - 1]:
				result[result.length - 2];
    }
}
