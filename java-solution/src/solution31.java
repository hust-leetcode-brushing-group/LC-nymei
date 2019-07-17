//next permutation
public class solution31 {
	public void nextPermutation(int[] nums) {
        int peak = 0;
        
        for(int i = nums.length - 1; i > 0; i--) {
        	if(nums[i-1] < nums[i]) {
        		peak = i;
        		break;
        	}
        }
        System.out.println(peak);
    	if(peak > 0) {
    		for(int i = peak; i <= nums.length - 1; i++) {
    			if(i == nums.length - 1){
                    swap(nums, peak - 1, i);
                    break;
                }
                if(nums[peak - 1] <= nums[i] && nums[peak - 1] >= nums[i + 1]) {
    				swap(nums, peak - 1, i);
    				break;
    			}
    		}
    	}
    	for(int i = 0; i <(nums.length - peak)/2; i++) {
            swap(nums, peak + i, nums.length - i - 1);
            System.out.println(nums[peak + i] + " " + nums[nums.length - i - 1]);
    	}
    }
    
    public void swap(int[] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }
}
