import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//group anagrams
public class solution49 {
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> m = new HashMap<>();
        for(String x: strs) {
        	char[] ch = x.toCharArray();
        	Arrays.sort(ch);
        	String key = String.valueOf(ch);
        	if(!m.containsKey(key)) {
        		m.put(key, new ArrayList<>());
        	}
        	m.get(key).add(x);
        }
        return new ArrayList<>(m.values());
    }
}
