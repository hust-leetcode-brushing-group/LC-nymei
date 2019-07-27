import java.util.ArrayList;
import java.util.List;

//combine
public class solution77 {
	public List<List<Integer>> combine(int n, int k) {
    	List<List<Integer>> result = new ArrayList<>();
    	List<Integer> temp = new ArrayList<>();
    	backtrack(result, temp, 1, n, k);
    	return result;
    }
    
    public void backtrack(List<List<Integer>> result, List<Integer> temp, int current, int n, int k) {
        if(k == 0) {
    		result.add(new ArrayList<>(temp));
    		return;
    	}
    	for(int i = current; i <= n; i++) {
    		temp.add(i); 
    		backtrack(result, temp, i + 1, n, k - 1);
    		// for(Integer m: temp){
    		// System.out.print(m + " ");
    		// // }
    		// System.out.println();
            temp.remove(temp.size() - 1);
    	}
    }
}
