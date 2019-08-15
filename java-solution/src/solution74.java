//search a 2D matrix
public class solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0)	return false;
    	int norows = matrix.length;
        int nocols = matrix[0].length;
        int start = 0;
        int end = norows * nocols - 1;
        while(start <= end) {
        	int mid = (start + end) / 2;
        	int midX = mid / norows;
        	int midY = mid / nocols;
        	if(matrix[midX][midY]==target) {
        		return true;
        	}
            if(matrix[midX][midY]<target) {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return false;
    }
}
