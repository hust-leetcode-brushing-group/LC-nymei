//spiral matrix
public class solution59 {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int count = 1;
        int status = 0;
        int up = 0;
        int down = n - 1;
        int left = 0;
        int right = n - 1;
        int i = up;
        int j = left;
        while(count <= n * n) {
        	result[i][j] = count;
        	count++;
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
