//set matrix zero
public class solution73 {
	public void setZeroes(int[][] matrix) {
        int norows = matrix.length;
        int nocols = matrix[0].length;
		boolean[] rowindex = new boolean[norows];
		boolean[] colindex = new boolean[nocols];
        for(int i = 0; i < norows; i++) {
        	for(int j = 0; j < nocols; j++) {
        		if(matrix[i][j] == 0) {
        			rowindex[i] = true;
        			colindex[j] = true;
        		}
        	}
        }
        for(int i = 0; i < norows; i++) {
        	if(rowindex[i]) {
        		for(int j = 0; j < nocols; j++) {
        			matrix[i][j] = 0;
        		}
        	}
        }
        for(int j = 0; j < nocols; j++) {
        	if(colindex[j]) {
        		for(int i = 0; i < norows; i++) {
        			matrix[i][j] = 0;
        		}
        	}
        }
    }
}
