import java.util.ArrayList;
import java.util.List;

// N Queens
public class solution51 {
	public List<List<String>> solveNQueens(int n) {
		List<List<String>> result = new ArrayList<>();
		char[][] board = new char[n][n];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n; j++)
				board[i][j] = '.';
		backtrack(result, board, 0);
		return result;
    }
	
	public void backtrack(List<List<String>> result, char[][] board, int line) {
        int total = board.length;
		if(line == total) {
			//add to result
            //System.out.println("here");
			List<String> temp = new ArrayList<>();
			for(int i = 0; i < total; i++) {
				String tempString = "";
				for(int j = 0; j < total; j++) {
					tempString += Character.toString(board[i][j]); 
				}	
				temp.add(tempString);
			}
			result.add(temp);
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
