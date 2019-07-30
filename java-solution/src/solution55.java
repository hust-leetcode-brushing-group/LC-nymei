// jump game I dynamic planning
public class solution55 {
	public boolean canJump(int[] nums) {
		if(nums.length == 1) {
			return true;
		}
		int total = 0;
		int temp = 0;
		for(int i = 0; i < nums.length - 1; i++) {
            if(total < i)   break;
			temp = i + nums[i];
			total = Math.max(temp, total);
		}
		if(total >= nums.length-1) {
			return true;
		}
		else {
			return false;
		}
		
    }
	
}
