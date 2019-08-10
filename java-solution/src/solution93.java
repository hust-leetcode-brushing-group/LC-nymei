import java.util.ArrayList;
import java.util.List;

//restore ip address
public class solution93 {
	public List<String> restoreIpAddresses(String s) {
        if(s.length() <= 3 || s.length() >=13) {
        	return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        String temp = s;
        for(int i = 1; i < s.length() - 2; i++) {
        	for(int j = i + 1; j < s.length() - 1; j++) {
        		for(int k = j + 1; k < s.length(); k++) {
        			temp = temp.substring(0,k) + "." + temp.substring(k);
        			temp = temp.substring(0,j) + "." + temp.substring(j);
        			temp = temp.substring(0,i) + "." + temp.substring(i);
        			if(checkValid(temp)) {
        				result.add(temp);
        			}
        			temp = s;
        		}
        	}
        }
        return result;
    } 

	private boolean checkValid(String temp) {
		String[] s = temp.split("[.]");
		for(String x: s) {
			int a = Integer.parseInt(x);
			if(a > 255 || x.length() > 3)	return false;
            if(x.length() == 3 && a < 100)  return false;
            if(x.length() == 2 && a < 10)   return false;
		}
		return true;
	}
	
}
