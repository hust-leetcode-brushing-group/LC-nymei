//valid sodoku
public class solution36 {
	public boolean isValidSudoku(char[][] board) {
		boolean[][] rowFlag = new boolean[9][9];
		boolean[][] colFlag = new boolean[9][9];
		boolean[][] boxFlag = new boolean[9][9];
		for(int i =0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(board[i][j] >='1' && board[i][j] <= '9') {
					int num = board[i][j]- '0';
					if(rowFlag[i][num] || colFlag[j][num] || boxFlag[3*(i/3-1)+j][num]) {
						return false;
					}
					rowFlag[i][num] = true;
					colFlag[j][num] = true;
					boxFlag[3*(i/3-1)+j][num] = true;
				}
			}
		}
		return true;
    }
}
