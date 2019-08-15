// missing number
public class solution268 {
	public int missingNumber(int[] nums) {
        int sum = (1 + nums.length) * nums.length / 2;
        int tempsum = 0;
        for(int x: nums) {
        	tempsum += x;
        }
        return sum - tempsum;
    }
}
