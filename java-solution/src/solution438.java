import java.util.ArrayList;
import java.util.List;

//find all anagrams in a string
public class solution438 {
	public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < s.length() - p.length();i++) {
        	if(isAnagram(s.substring(i, i + s.length()), p)) {
        		result.add(i);
        	}
        }
        return result;
    }
	
	private boolean isAnagram(String s, String t) {
        if(s.length() != t.length())	return false;
		int[] count = new int[26];
        for(char x: s.toCharArray()) {
        	count[x - 'a']++;
        }
        for(char x: t.toCharArray()) {
        	if(--count[x - 'a'] < 0)	return false;
        }
        return true;
    }
}
