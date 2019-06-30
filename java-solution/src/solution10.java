//regular expression matching
//recursion
public class solution10 {
	public boolean isMatch(String s, String p) {
        if(s.isEmpty())	return p.isEmpty();
        boolean first_match = (!s.isEmpty()) && ((s.charAt(0) == p.charAt(0))|| p.charAt(0) == '.');
        if(p.length() >= 2 && p.charAt(1) == '*') {
        	return (first_match && isMatch(s.substring(1), p)) 
        			|| (isMatch(s, p.substring(2)));
        }
        else {
        	return isMatch(s.substring(1), p.substring(1));
        }
    }
	
	public static void main(String[] args) {
		
	}
}
