//telephone number letter combination
import java.util.ArrayList;
import java.util.List;

public class solution17 {
	public List<String> letterCombinations(String digits) {
		
        List<String> result = new ArrayList<>();
		String[] combi = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(digits.isEmpty())	return result;
		result.add("");
		for (int i = 0;i < digits.length();i++) {
			result = expand(result, combi[digits.charAt(i)-'2']);
		}
		return result;
    }
	
	public List<String> expand(List<String> temp, String next){
		List<String> result = new ArrayList<>();
        System.out.println(next);
		for(String x:temp) {
			for(int i = 0; i < next.length();i++) {
				result.add(x + next.substring(i, i+1));
			}
		}
		return result;
	}
}
