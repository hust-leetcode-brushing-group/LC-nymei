// valid palindrome
public class solution125 {
	public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int start = 0;
        int end = s.length() - 1;
        while(start <= end) {
        	int a = isAlphabet(s, start);
        	int b = isAlphabet(s, end);
        	if(a >= 0 && b >= 0) {
        		if(a != b)	return false;
        		start++;
        		end--;
        	}
        	else {
        		if(a == -1)	start++;
        		if(b == -1) end--;
        	}
            
        }
        return true;
    }
	
	private int isAlphabet(String s, int index) {
		char a = s.charAt(index);
		if((a >= 'A' && a <= 'Z')) {
			return a - 'A' + 10;
		}
		else if((a >= 'a' && a <= 'z')) {
			return a - 'a' + 10;
		}
        else if((a >= '0' && a <= '9')) {
            return a - '0';
        }
		else {
			return -1;
		}
	}
}
