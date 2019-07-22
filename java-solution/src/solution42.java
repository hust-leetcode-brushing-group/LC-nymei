import java.util.Stack;

//trapping rain water
public class solution42 {
	public int trap(int[] height) {
    	int result = 0;
    	Stack<Integer> stack = new Stack<>();
    	int index = 0;
    	while(index < height.length) {
    		if(stack.isEmpty()) {
                stack.push(index);
    		}
    		else if(height[index] < height[stack.peek()]) {
    			stack.push(index);
    		}
    		else if(height[index] >= height[stack.peek()]) {
                int temp = 0;
                if(index - stack.peek() == 1)	temp = height[stack.pop()];
    			while(!stack.isEmpty() && height[index] >= height[stack.peek()]) {
    				result += (height[stack.peek()] - temp) * (index - stack.peek() - 1);
    				temp = height[stack.pop()];
    			}
    			if(!stack.isEmpty()) {
    			    result += (Math.min(height[stack.peek()], height[index]) - temp) * (index - stack.peek() - 1);
    			}
                stack.push(index);
    		}
            index++;
    	}
    	return result;
    }
}
