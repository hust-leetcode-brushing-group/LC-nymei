import java.util.ArrayList;
import java.util.List;

// N Queens II
public class solution52 {
	public int totalNQueens(int n) {
        int[] result = new int[1];
		char[][] board = new char[n][n];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				board[i][j] = '.';
		backtrack(result, board, 0);
        return result[0];
    }
    
    public void backtrack(int[] result, char[][] board, int line) {
        int total = board.length;
		if(line == total) {
			result[0]++;
            return;
		}
		for(int j = 0; j < total; j++) {
            //System.out.println("lines: " + line + " j: " + j);
			board[line][j] = 'Q';
			if(checkValid(board, line, j))
				backtrack(result, board, line + 1);
			board[line][j] = '.';
		}
	}
	
	public boolean checkValid(char[][] board, int row, int col) {
		for(int i = 0; i < board.length; i++) {
			if(board[row][i] == 'Q' && i != col)	return false;
			if(board[i][col] == 'Q' && i != row)	return false;
		}
		for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--,j--) {
			if(board[i][j] == 'Q')	return false;
		}
		for(int i = row + 1, j = col + 1; i < board.length && j < board.length; i++,j++) {
			if(board[i][j] == 'Q')	return false;
		}
        for(int i = row + 1, j = col - 1; i < board.length && j >= 0; i++,j--) {
			if(board[i][j] == 'Q')	return false;
		}
		for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--,j++) {
			if(board[i][j] == 'Q')	return false;
		}
		return true;
	}
}
