//unique path II
public class solution63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int no_rows = obstacleGrid.length;
        int no_cols = obstacleGrid[0].length;
        int[][] steps = new int [no_rows][no_cols];
        steps[0][0] = (obstacleGrid[0][0] == 1) ? 0: 1;
        for(int i = 1; i < no_rows; i++) {
        	steps[i][0] = (obstacleGrid[i][0] == 1)? 0: steps[i - 1][0];
        }
        for(int j = 1; j < no_cols; j++) {
        	steps[0][j] = (obstacleGrid[0][j] == 1)? 0: steps[0][j - 1];
        }
        for(int i = 1; i < no_rows; i++) {
        	for(int j = 1; j < no_cols; j++) {
        		steps[i][j] = (obstacleGrid[i][j] == 1)? 0:(steps[i - 1][j] + steps[i][j - 1]);
        	}
        }
		return steps[no_rows - 1][no_cols - 1];
    }
}
