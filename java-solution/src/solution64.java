// minimum sum path
public class solution64 {
	public int minPathSum(int[][] grid) {
        int no_rows = grid.length;
        int no_cols = grid[0].length;
		int[][] sum = new int[no_rows][no_cols];
		sum[0][0] = grid[0][0];
		for(int i = 1; i < no_rows; i++) {
			sum[i][0] = sum[i - 1][0] + grid[i][0];
		}
		for(int j = 1; j < no_cols; j++) {
			sum[0][j] = sum[0][j - 1] + grid[0][j];
		}
		for(int i = 1; i < no_rows; i++) {
			for(int j = 1; j < no_cols; j++) {
				sum[i][j] = (sum[i - 1][j] > sum[i][j - 1])? (sum[i][j - 1] + grid[i][j]): 
					(sum[i - 1][j] + grid[i][j]);
			}
		}
		return sum[no_rows - 1][no_cols - 1];
    }
}
