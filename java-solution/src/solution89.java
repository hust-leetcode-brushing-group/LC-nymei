import java.util.ArrayList;
import java.util.List;

//gray code
public class solution89 {
	public List<Integer> grayCode(int n) {
		List<Integer> result = new ArrayList<>();
		if(n == 0)	return result;
		if(n == 1) {
			result.add(0);
			result.add(1);
		}
		else {
			List<Integer> tempresult = grayCode(n-1);
			for(int i = 0; i < tempresult.size(); i++) {
				result.add(tempresult.get(i));
			}
			for(int i = tempresult.size() - 1; i >= 0; i++) {
				result.add(tempresult.get(i) | (1 << (n - 1)));
			}
		}
		return result;
    }
}
