import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//roman to integer
public class solution13 {
	public int romanToInt(String s) {
		int result = 0;
		int[] int_dict = {1,5,10,50,100,500,1000};
		List<Integer> intList = new ArrayList<Integer>();
		for (int i : int_dict) {
		    intList.add(i);
		}
		char[] roman_dict = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
		List<Character> romanList = new ArrayList<Character>();
		for (char st : roman_dict) {
		    romanList.add(st);
		}
		for(int i = 0; i < s.length(); i++) {
        	if(i <= s.length() - 2) {
        		if((romanList.indexOf(s.charAt(i)) & 1) == 0 && 
        				s.charAt(i) != 'M') {
        			if(romanList.indexOf(s.charAt(i + 1)) == romanList.indexOf(s.charAt(i)) + 1 ||
        					romanList.indexOf(s.charAt(i + 1)) == romanList.indexOf(s.charAt(i)) + 2) {
        				result += intList.get(romanList.indexOf(s.charAt(i + 1))) - 
        						intList.get(romanList.indexOf(s.charAt(i)));
        				i++;
        			}
        			else {
        				result += intList.get(romanList.indexOf(s.charAt(i)));
        			}
        		}
        		else {
        			result += intList.get(romanList.indexOf(s.charAt(i)));
        		}
        	}
        	else {
        		result += intList.get(romanList.indexOf(s.charAt(i)));
        	}
        }
        return result;
    }
}
