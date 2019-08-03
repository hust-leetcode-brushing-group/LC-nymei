import java.util.List;
//triangle
public class solution120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		int tsize = triangle.size();
		int[] totals = new int[tsize];
		for(int i = 0; i < triangle.get(tsize - 1).size(); i++) {
			totals[i] = triangle.get(tsize - 1).get(i);
		}
		for(int i = tsize - 2; i >= 0; i--) {
			for(int j = 0; j < triangle.get(i).size(); j++) {
				totals[j] = triangle.get(i).get(j) + Math.min(totals[j], totals[j + 1]);
			}
		}
		return totals[0];
    }
}
