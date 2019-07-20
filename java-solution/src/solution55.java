/*TODO: jump game:dynamic planning*/
public class solution55 {
	public boolean canJump(int[] nums) {
		
		return backtrack(nums, 0);
    }
	
	public boolean backtrack(int[]nums, int start) {
		if(nums[start] == 0)	return false;
		if(nums[start] + start >= nums.length - 1)	return true;
		for(int i = start; i < start + nums[start]; i++) {
			if(backtrack(nums, i))	return true;
		}
		return false;
	}
}
