//rotate image
public class solution48 {
	public void rotate(int[][] matrix) {
        int n = matrix.length;
		for(int i = 0; i < n; i++)
			for(int j = i + 1; j < n; j++)
				swap(matrix, i, j, j, i);
		
		for(int i = 0; i < n; i++) 
			for(int j = 0;j < n/2; j++)
				swap(matrix, i, j, i, n - j);
    }
	
	public void swap(int[][] matrix, int ia, int ja, int ib, int jb) {
		int temp = matrix[ia][ja];
		matrix[ia][ja] = matrix[ib][jb];
		matrix[ib][jb] = temp;
	}
}
