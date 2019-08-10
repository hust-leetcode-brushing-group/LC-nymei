//search insert position
public class solution35 {
	public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;
        while(left <= right) {
            //System.out.println(left + " " + right);
        	mid = (left + right) / 2;
        	if(nums[mid] == target)	return mid;
        	if(nums[mid] > target) {
        		right--;
        	}
        	else {
        		left++;
        	}
        }
        return target > nums[mid] ? mid + 1 : mid;
    }
}
