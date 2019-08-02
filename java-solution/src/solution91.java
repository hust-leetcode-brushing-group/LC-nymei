// decode ways
public class solution91 {
	public int numDecodings(String s) {
    	if(s.charAt(0) == '0')  return 0;
    	int[] ways = new int[s.length()];
        ways[0] = 1;
    	for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) != '0')
                ways[i] = ways[i - 1];
    		if(twoCharToInt(s.charAt(i - 1), s.charAt(i))) {
    			if(i >= 2){
                    ways[i] += ways[i-2];
                }
                else{
                    ways[i]++;
                }
    		}
    	}
    	return ways[s.length() - 1];
    }
    
    public boolean twoCharToInt(char a, char b) {
    	int num = (a - '0') * 10 + (b - '0');
    	if(num <= 26 && num >= 10)	return true;
    	else return false;
    }
}
