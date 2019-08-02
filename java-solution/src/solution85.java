import java.util.Stack;

//maximal rectangle
public class solution85 {
    public int maximalRectangle(char[][] matrix) {
       int no_rows = matrix.length;
       int no_cols = matrix[0].length;
       int[][] area = new int[no_rows][no_cols];
       int max = 0;
       for(int j = 0; j < no_cols; j++) {
    	   area[0][j] = matrix[0][j] - '0';
       }
       for(int i = 1; i < no_rows; i++) {
    	   for(int j = 0; j < no_cols; j++) {
    		   area[i][j] = (matrix[i][j] == '1')? (area[i - 1][j] + 1): 0;
    	   }
       }
       for(int i = 0; i < no_rows; i++) {
    	   max = Math.max(maxAreaHist(area[no_rows]), max);
       }
       return 0;
    }
    
    private int maxAreaHist(int[] height) {
    	Stack<Integer> stack = new Stack<Integer>();
    	 
    	int i = 0;
    	int max = 0;
     
    	while (i < height.length) {
    		if (stack.isEmpty() || height[stack.peek()] <= height[i]) {
    			stack.push(i++);
    		} else {
    			int t = stack.pop();
    			max = Math.max(max, height[t]
    					* (stack.isEmpty() ? i : i - stack.peek() - 1));
    		}
    	}
     
    	return max;
    }
}
