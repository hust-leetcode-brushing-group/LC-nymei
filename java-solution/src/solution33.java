// search in rotated array
public class solution33 {
	public int search(int[] nums, int target) {
		if(nums.length <= 2){
            return searchSmaller(nums, 0, nums.length - 1, target);
        }
        int low = 0;
		int high = nums.length - 1;
		int mid = (low + high)/2;
		while(low <= high) {
            System.out.println(nums[low] + " " + nums[high]);
			if(nums[mid] == target) {
				return mid;
			}
            if(nums[low] > target && nums[high] < target)   return -1;
            if(high - low <= 2) return searchSmaller(nums, low, high, target);
			if(nums[mid] < nums[high] && nums[mid] > nums[low]) {//no rotation happens
				if(target > nums[mid])
					low = mid;
				else
					high = mid;
			}
			else if(nums[mid] > nums[high] && nums[mid] > nums[low]) {//rotation point at right
				if(target > nums[mid] || target <= nums[high])
					low = mid;
				else if(target >= nums[low])
					high = mid;
			}
			else if(nums[mid] < nums[high] && nums[mid] < nums[low]) {//rotation point at left 
				if(target < nums[mid] || target >= nums[low])
					high = mid;
				else if(target <= nums[high])
					low = mid;
			}
			mid = (low + high)/2;
		}
		return -1;
    }
    
    public int searchSmaller(int[] nums, int low, int high, int target){
        for(int i = low; i <= high; i++){
            if(nums[i] == target)   return i;
        }
        return -1;
    }
}
