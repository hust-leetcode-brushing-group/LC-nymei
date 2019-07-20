//length of last word
public class solution58 {
	public int lengthOfLastWord(String s) {
		int length = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == ' ' && length > 0)	return length;
			if(s.charAt(i) != ' ')length++;
		}
		return length;
    }
}
