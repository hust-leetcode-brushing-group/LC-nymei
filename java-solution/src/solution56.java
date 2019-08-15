import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// merge intervals
public class solution56 {
	public int[][] merge(int[][] intervals) {
        if(intervals.length == 0 || intervals.length == 1)	return intervals;
        int norows = intervals.length;
        int nocols = intervals[0].length;
		List<List<Integer>> tempResult = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        for(int i = 0; i < norows; i++) {
        	if(tempResult.isEmpty()) {
        		List<Integer> temp = new ArrayList<>();
        		temp.add(intervals[i][0]);
        		temp.add(intervals[i][nocols - 1]);
        		tempResult.add(temp);
        	}
        	else {
        		if(intervals[i][0] < tempResult.get(tempResult.size() - 1).get(0)) {
        			if(intervals[i][1] > tempResult.get(tempResult.size() - 1).get(1)) {
        				tempResult.get(tempResult.size() - 1).set(1, intervals[i][1]);
        			}
        		}
        		else {
        			List<Integer> temp = new ArrayList<>();
            		temp.add(intervals[i][0]);
            		temp.add(intervals[i][nocols - 1]);
            		tempResult.add(temp);
        		}
        	}
        }
        int[][] result = new int[tempResult.size()][2];
        for (int i = 0; i < tempResult.size(); i++) {
        }
        
    }
}
