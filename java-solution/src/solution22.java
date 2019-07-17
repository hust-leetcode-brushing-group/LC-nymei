import java.util.ArrayList;
import java.util.List;

// generate parentheses
public class solution22 {
	public List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		para_rec(list, "", 0, 0, n);
		return list;
        
    }
	
	public void para_rec(List<String> list, String cur, int num_open, 
			int num_close, int total) {
		if(num_open == num_close && num_open == total) {
			list.add(cur);
		}
		if(num_open < total) {
			para_rec(list, cur + "(", num_open + 1, num_close, total);
		}
		if(num_close < num_open) {
			para_rec(list, cur + ")", num_open, num_close + 1, total);
		}
		
	}
}
