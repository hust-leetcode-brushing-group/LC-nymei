import java.util.Arrays;

// majority element
public class solution169 {
	public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
