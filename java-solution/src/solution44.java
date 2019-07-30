//wildcard matching
public class solution44 {
	public boolean isMatch(String s, String p) {
        if(s == null || p == null)	return true;
		int count = 0;
		for(int i = 0; i < p.length(); i++) {
			if(p.charAt(i) != '*') 	count++;
			if(count > s.length())	return false;
		}
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        for(int j = 0; j < p.length(); j++) {
            //System.out.println(dp[0][j]);
        	dp[0][j + 1] = dp[0][j] && p.charAt(j) == '*';
        	for(int i = 0; i < s.length(); i++) {
        		if(p.charAt(j) == s.charAt(i) || p.charAt(j) == '?') {
        			dp[i + 1][j + 1] = dp[i][j]; 
        		}
        		else if(p.charAt(j) == '*') {
        			dp[i + 1][j + 1] = dp[i][j+1] || dp[i + 1][j];
        		}
        		else {
        			dp[i + 1][j + 1] = false;
        		}
        	}
        }
        return dp[s.length()][p.length()];
    }
}
