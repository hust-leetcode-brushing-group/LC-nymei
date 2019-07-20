//longest common prefix
public class solution14 {
	public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)	return "";
		String result = strs[0];
		for(int i = 1; i < strs.length;i++) {
        	for(int j = 0; j < result.length(); j++) {
        		if(j >= strs[i].length() || result.charAt(j) != strs[i].charAt(j)) {
        			result = result.substring(0,j);
        			break;
        		}
        	}
        }
		return result;
    }
}
