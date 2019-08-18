import java.util.HashMap;
import java.util.Map;

//minimum window substring
public class solution76 {
	public String minWindow(String s, String t) {
        if(t.length() > s.length())	return "";
		Map<Character, Integer> m = new HashMap<>();
        int start = 0;
        int end = 0;
        int minStart = 0;
        int minLen = Integer.MAX_VALUE;
        int count = t.length();
        for(char x: s.toCharArray()) {
        	m.put(x, 0);
        }
        for(char x: t.toCharArray()) {
        	if(m.containsKey(x)) {
        		m.put(x, m.get(x) + 1);
        	}
        	else {
        		return "";
        	}
        }
        while(end < s.length()) {
        	char c = s.charAt(end);
        	if(m.get(c) > 0)	count--;
        	m.put(c, m.get(c) - 1);
        	while(count == 0) {
        		if(minLen > end - start + 1) {
        			minLen = end - start + 1;
        			minStart = start;
        		}
        		char ch = s.charAt(start);
                m.put(ch, m.get(ch) + 1);
                if(m.get(ch) > 0) {
                	count++;
                }
                start++;
        	}
        	end++;
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(minStart, minStart+minLen);
    }
}
