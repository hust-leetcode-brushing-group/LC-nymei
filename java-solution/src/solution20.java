//valid parentheses
import java.util.Stack;

public class solution20 {
	public boolean isValid(String s) {
        if(s.isEmpty())	return true;
        
		Stack<String> a = new Stack<>();
		String left_para = "({[";
		String right_para = ")}]";
        for(int i = 0; i < s.length(); i++) {
        	String current_item = s.substring(i, i+1);
        	if(left_para.contains(current_item)) {
        		a.push(current_item);
        	}
        	else if(right_para.contains(current_item)){
        		if (a.isEmpty())	return false;
        		int type = right_para.indexOf(current_item);
        		String past_item = a.pop();
        		int past_type = left_para.indexOf(past_item);
        		if(past_type != type)	return false;
        	}
        }
        if(a.isEmpty())	return true;
        else return false;
    }
}
