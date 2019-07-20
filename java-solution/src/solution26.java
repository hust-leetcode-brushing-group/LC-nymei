//remove duplication from sorted array
public class solution26 {
	public int removeDuplicates(int[] nums) {
        if(nums.length == 0)	return 0;
		int length = nums.length;
		int current = nums[0];
        int index = 0;
		for(int i = 1; i < nums.length; i++) {
        	if(current != nums[i]) {
        		nums[index+1] = nums[i];
        		current = nums[i];
        		index = index + 1;
        	}
        	else {
        		length = length - 1;
        	}
        }
		return length;
    }

}
