import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// happy number
public class solution202 {
	public boolean isHappy(int n) {
        if(n == 1)	return true;
        int slow = n;
        int fast = n;
        while(true) {
        	slow = intToHappy(slow);
        	fast = intToHappy(intToHappy(fast));
        	if(slow == fast) {
        		break;
        	}
        }
        return (slow == 1);
    }
	
	private int intToHappy(int x) {
		int sum = 0;
		while(x > 0) {
			sum += (x % 10) * (x % 10);
			x = x / 10;
		}
		return sum;
	}
}
