// Integer to English Words
public class solution273 {
	public String numberToWords(int num) {
		if(num == 0)	return "Zero";
		if(num < 0)		return "Negative " + numberToWords(-num);
        String[] ones = {"One", "Two","Three","Four","Five",
                         "Six","Seven","Eight","Nine"};
        String[] elevens = {"Ten","Eleven", "Twelve","Thirteen","Fourteen","Fifteen",
                            "Sixteen","Seventeen","Eighteen","Nineteen"};
        String[] tens = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", 
                         "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] units = {"Billion","Million", "Thousand", "Hundred", "Ten", "One"};
        int[] units_int = {1000000000, 1000000, 1000, 100, 10, 1};
        for(int i = 0; i < units_int.length; i++) {
        	if(units_int[i] <= num) {
        		if(i <= 3) {
                    if(num%units_int[i]!=0)
        			    return numberToWords(num/units_int[i]) + " " + units[i] + " " + numberToWords(num%units_int[i]);
                    else
                        return numberToWords(num/units_int[i]) + " " + units[i];
        		}
        		else {
        			if(i == 4) {
        				if(num/units_int[i]-1 >= 1){
                            if(num%units_int[i]!=0)
                                return tens[num/units_int[i]-1]  + " " + numberToWords(num%units_int[i]);
                            else
                                return tens[num/units_int[i]-1];
                        }
                        else{
                            return elevens[num%units_int[i]];
                        }
                        
        			}
        			else {
        				return ones[num/units_int[i]-1];
        			}
        		}
        	}
        }
        return "";
    }
}
