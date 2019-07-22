import java.util.Stack;

//simplyfy path
public class solution71 {
	public String simplifyPath(String path) {
        String result  = "";
        Stack<String> stack = new Stack<>();
        String[] symbols = path.split("/");
        //System.out.println(Arrays.toString(symbols));
        for(int i = 0; i < symbols.length; i++) {
            //System.out.println(symbols[i]);
        	if(symbols[i].equals(".") || symbols[i].equals(""))	continue;
        	else if(symbols[i].equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }	
        	else {
                //System.out.println("here");
                stack.push(symbols[i]);
            }
        }
        if(stack.isEmpty()) return "/";
        while(!stack.isEmpty())
        	result = "/" + stack.pop() + result;
        return result;
    }
}
