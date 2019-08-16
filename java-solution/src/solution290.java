import java.util.HashMap;
import java.util.Map;

public class solution290 {
	public boolean wordPattern(String pattern, String str) {
		String[] strs = str.split(" ");
		if(strs.length != pattern.length())	return false;
		Map<Character, String> pattostr = new HashMap<>();
		for(int i = 0; i < pattern.length(); i++) {
			if(!pattostr.containsKey(pattern.charAt(i))) {
				if(pattostr.values().contains(strs[i]))	return false;
                pattostr.put(pattern.charAt(i), strs[i]);
			}
			else {
				if(!strs[i].equals(pattostr.get(pattern.charAt(i)))) {
					return false;
				}
			}
		}
		return true;
    }
}
