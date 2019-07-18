//panlindrome number
public class solution9 {
	public boolean isPalindrome(int x) {
		if(x < 0)	return false;
        int result = 0;
        while(result < x) {
        	result = 10 * result + x % 10;
        	x = x / 10;
        }
        return result == x || result/10 == x;
    }
}
