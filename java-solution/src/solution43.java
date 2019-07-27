//multiply string
public class solution43 {
	public String multiply(String num1, String num2) {
        String result = "";
        int[] digits = new int[num1.length() + num2.length()];
        for(int i = num1.length() - 1; i >=0; i--) {
        	for(int j = num2.length() - 1; j >=0; j--) {
            	//System.out.println(i+j+1);
                int sum = digits[i + j + 1] + (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                digits[i + j + 1] = sum % 10;
            	digits[i + j] += sum / 10;
                //System.out.println(Arrays.toString(digits));
            }
        }
        
        for(int d:digits) {
        	if(!result.isEmpty() || d != 0)
        		result += Character.toString((char) (d+'0'));
        }
        if(result.isEmpty())	return "0";
        else	return result;
    }
}
