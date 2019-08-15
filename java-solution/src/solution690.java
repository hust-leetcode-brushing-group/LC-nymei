import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class solution690 {
	public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> m = new HashMap<>();
        for(Employee e: employees) {
        	m.put(e.id, e);
        }
        return helper(id, m);
    }
	
	private int helper(int eid, Map<Integer, Employee> m) {
		Employee e = m.get(eid);
		int ans = e.importance;
        for (Integer subid: e.subordinates)
            ans += helper(subid, m);
        return ans;
	}
}
