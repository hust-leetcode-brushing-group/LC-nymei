//remove element
public class solution27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
        	if(nums[i]!= nums[j]) {
        		nums[i] = nums[j];
        		i++;
        	}
        }
        
        return i;
    }
}
