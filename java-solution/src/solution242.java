// valid anagram
public class solution242 {
	public boolean isAnagram(String s, String t) {
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
