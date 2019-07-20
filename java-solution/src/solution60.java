import java.util.ArrayList;
import java.util.List;

//permutation sequence
public class solution60 {
	public String getPermutation(int n, int k) {
		List<Integer> nums = new ArrayList<>();
		int total = 1;
		String result  = "";
		for(int i = 1; i <= n; i++) {
			nums.add(i);
			total *= i;
		}
		total = total/n;
		for(int i = n-1; i != 0; i--) {
            System.out.println(k + " " + total + " " + i);
			result += String.valueOf(nums.get((k - 1)/total));
            nums.remove((k - 1)/total);
			
            k = k - ((k-1)/total*total);
            total /= i;
			
		}
        result += String.valueOf(nums.get(0));
		return result;
    }
}
