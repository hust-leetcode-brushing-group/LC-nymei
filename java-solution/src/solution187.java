import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//repeated dna sequences
public class solution187 {
    public List<String> findRepeatedDnaSequences(String s) {
    	List<String> result = new ArrayList<>();
    	Map<Character, Integer> m = new HashMap<>();
    	Set<Integer> same = new HashSet<>();
    	m.put('A', 0);
    	m.put('G', 1);
    	m.put('C', 2);
    	m.put('T', 3);
    	int mask = (1 << 20) - 1;
    	int hash = 0;
    	for(int i = 0; i < s.length(); i++) {
    		hash = (hash<<2) + m.get(s.charAt(i));
    		hash &= mask;
    		if(i >= 9) {
    			if(!(same.contains(hash))) {
    				same.add(hash);
    			}
    			else {
    				String temp = s.substring(i - 9, i + 1);
    				if(!(result.contains(temp))) {
    					result.add(temp);
    				}
    			}
    		}
    	}
    	return result;
    }
}
