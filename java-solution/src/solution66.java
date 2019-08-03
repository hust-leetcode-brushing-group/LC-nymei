// plus one
public class solution66 {
    public int[] plusOne(int[] digits) {
    	int carry = 0;
    	for(int i = digits.length - 1; i >= 0; i--) {
    		if(i == digits.length - 1) {
    			carry = (digits[i] + 1) / 10;
    			digits[i] = (digits[i] + 1) % 10;
    		}
    		else {
    			int temp = digits[i] + carry;
    			digits[i] = temp % 10;
    			carry = temp / 10;
    		}
    	}
    	if(carry == 0)	return digits;
    	else {
    		int[] result = new int[digits.length + 1];
    		result[0] = carry;
    		for(int i = 1; i < result.length; i++) {
    			result[i] = digits[i - 1];
    		}
    		return result;
    	}
    }
}
