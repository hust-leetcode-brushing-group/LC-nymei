
// sodoku solver
public class solution37 {
	public void solveSudoku(char[][] board) {
		backtrack(board, 0,0);
    }
	
	public boolean backtrack(char[][] board, int i, int j) {
		if(i == 9)	return true;
		if(j >= 9)	return backtrack(board, i + 1, 0);
		if(board[i][j] == '.') {
			for(int num = 1; num <= 9; num++) {
				board[i][j] = (char)(num + '0');
				if(checkValid(board, i, j, num)) {
					if(backtrack(board, i, j + 1)) {
						return true;
					}
				}
				board[i][j] = '.';
			}
		}
		else {
			return backtrack(board, i, j + 1);
		}
		return false;
	}
	
	public boolean checkValid(char[][] board, int row, int col, int num) {
		for(int i = 0; i < 9; i++) {
			if(board[row][i] == (char)(num + '0') && i != col)	return false;
			if(board[i][col] == (char)(num + '0') && i != row)	return false;
		}
		for(int i = 3 * (row/3); i < 3 * (row/3) + 3; i++) {
			for(int j = 3 * (col/3); j < 3 * (col/3) + 3; j++) {
				if(board[i][j] == (char)(num + '0') && (i != row || j != col))	return false;
			}
		}
		return true;
	}
	
}
