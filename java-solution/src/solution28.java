//implement strStr()
public class solution28 {
	public int strStr(String haystack, String needle) {
        if(needle.isEmpty())	return 0;
        for(int i = 0; i < haystack.length();) {
            //System.out.println(i);
            if(i + needle.length() > haystack.length())  break;
        	else if(haystack.charAt(i) !=  needle.charAt(0)) i++;
        	else if(haystack.charAt(i) ==  needle.charAt(0)) {
        		int pointer = i;
        		for(int j = 0; j < needle.length(); j++) {
        			//System.out.println(j);
                    if(haystack.charAt(i + j) != needle.charAt(j)){
                        i++;
        				break;
                    }
                    else if(haystack.charAt(i + j) == needle.charAt(j) && j == needle.length() - 1){
                        return pointer;
                    }
        		}
        		
        	}
        }
        return -1;
    }
}
