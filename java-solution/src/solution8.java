//implementing atoi
public class solution8 {
	public int myAtoi(String str) {
		int result = 0;
		int index = 0;
		boolean minus = false;
		boolean signed = false;
		if(str.equals("")) return 0;
		// finding the starting point of the digit in a given string
		while(str.charAt(index)>'9' || str.charAt(index)<'0') {
			if(str.charAt(index) == ' ') {
				index++;
				if(index >= str.length())	return 0;
				if(signed == true)	return 0;	
			}
			else if (str.charAt(index) == '+' && signed == false) {
				index++;
				signed = true;
				if(index >= str.length()) return 0;
			}
			else if (str.charAt(index) == '-' && signed == false) {
				index++;
				minus = true;
				signed = true;
				if(index >= str.length()) return 0;
			}
			else {
				return 0;
			}
		}
		//converting string to integers, stop when string ends or meet illegal conditions
		while(index < str.length()) {
			if(str.charAt(index)>='0' && str.charAt(index)<='9') {
				int digit = str.charAt(index) - 48;
				if(minus == true) {
					long temp_result = 10 * (long)result - digit;
					index++;
					if(temp_result >= Integer.MIN_VALUE)	result = (int)temp_result;
					else return Integer.MIN_VALUE;
				}
				else {
					long temp_result = 10 * (long)result + digit;
					index++;
					if(temp_result <= Integer.MAX_VALUE)	result = (int)temp_result;
					else return Integer.MAX_VALUE;
				}
			}
			else {
				return result;
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		solution8 a = new solution8();
		System.out.println(a.myAtoi("- 6"));
	}
}
