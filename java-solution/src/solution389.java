//find the difference
public class solution389 {
	public char findTheDifference(String s, String t) {
        char result = 0;
        s = s + t;
        for(int i = 0; i < s.length(); i++) {
        	result ^= s.charAt(i);
        }
        return result;
    }
}
