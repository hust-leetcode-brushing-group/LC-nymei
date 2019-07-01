//container with most water
public class solution11 {
	public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max_area = 0;
        while(end - start > 0) {
        	if(height[end] < height[start]) {
        		int temp = (end - start) * height[end];
        		if(temp > max_area)	max_area = temp;
        		end--;
        	}
        	else if(height[end] > height[start]){
        		int temp = (end - start) * height[start];
        		if(temp > max_area) max_area = temp;
        		start++;
        	}
        	else {
        		int temp = (end - start) * height[start];
        		if(temp > max_area) max_area = temp;
        		if(height[end - 1] > height[start + 1])	end--;
        		else	start++;
        	}
        }
		return max_area;
    }
}
