import java.util.ArrayList;
import java.util.List;

//majority element II
public class solution229 {
	public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int num1 = 0;
        int num2 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int x: nums) {
        	if(x == num1) {
        		count1++;
        	}
        	else if(x == num2) {
        		count2++;
        	}
        	else if(count1 == 0) {
        		num1 = x;
        		count1++;
        	}
        	else if(count2 == 0) {
        		num2 = x;
        		count2++;
        	}
        	else {
        		count1--;
        		count2--;
        	}
        }
        count1 = 0;
        count2 = 0;
        for(int x: nums) {
        	if(x == num1)	count1++;
        	if(x == num2)	count2++;
        }
        if(count1 > nums.length / 3)	result.add(num1);
        if(count2 > nums.length / 3 && num1 != num2)	result.add(num2);
		return result;
    }
}
