import java.util.ArrayList;
import java.util.List;

//spiral matrix
public class solution54 {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		if(matrix.length == 0)	return result;
		int up = 0;
		int down = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;
		int size = matrix.length * matrix[0].length;
		int i = up;
		int j = left;
		int status = 0;
        int count = 0;
		while(count!= size) {
            //System.out.println(i + " " + j + " " + status);
            count++;
			result.add(matrix[i][j]);
			if(status == 0) {
				if(j < right)	j++;
				else {
					i++;
					status = 1;
				}
			}
			else if(status == 1) {
				if(i < down)	i++;
				else {
					j--;
					status = 2;
				}
			}
			else if(status == 2) {
				if(j > left)	j--;
				else {
					i--;
					status = 3;
				}
			}
			else if(status == 3) {
				if(i > up + 1)	i--;
				else {
					up++;down--;left++;right--;
					i = up;
					j = left;
					status = 0;
				}
			}
		}
        return result;
    }
}
