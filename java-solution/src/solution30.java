import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//concatenation of all words
public class solution30 {
	public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if(words.length == 0)   return result;
        int singleLen = words[0].length();
        int totalLen = words.length;
        Map<String, Integer> m = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
        	if(m.containsKey(words[i])) {
        		m.put(words[i], m.get(words[i]) + 1);
        	}
        	else {
        		m.put(words[i], 1);
        	}
        }
        for(int i = 0; i <= s.length() - totalLen*singleLen; i++) {
            //System.out.println("start: " + i);
        	if(checkConcat(m, s, i, singleLen, totalLen)) {
        		result.add(i);
        	}
        }
        return result;
    }
	
	private boolean checkConcat(Map<String, Integer> m, String s, int start, int singleLen, int totalLen) {
		if(s.length() - start + 1 < singleLen * totalLen)	return false;
		Map<String, Integer> current = new HashMap<>();
		for(int i = 0; i < totalLen; i++) {
            //System.out.println(start + i * singleLen);
            if(start + (i + 1) * singleLen > s.length())    return false;
			String curWord = s.substring(start + i * singleLen, start + (i + 1) * singleLen);
			if(!m.containsKey(curWord))	return false;
			else {
				if(current.containsKey(curWord)) {
					current.put(curWord, current.get(curWord) + 1);
				}
				else {
					current.put(curWord, 1);
				}
				if(current.get(curWord) > m.get(curWord)) {
					return false;
				}
			}
		}
		return true;
		
	}
}
