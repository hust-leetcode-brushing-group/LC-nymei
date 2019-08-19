// add binary
public class solution67 {
	public String addBinary(String a, String b) {
		String result = "";
		int carry = 0;
		for(int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; ) {
			if(i >= 0 && j >= 0) {
				int sum = a.charAt(i) - '0' + b.charAt(j) - '0' + carry;
				result = String.valueOf(sum % 2) + result;
				carry = sum / 2;
				i--;
				j--;
			}
			else if(i < 0 && j < 0) {
				return result;
			}
			else if(i >= 0 && j < 0) {
				int sum = a.charAt(i) - '0' + carry;
				result = String.valueOf(sum % 2) + result;
				carry = sum / 2;
                i--;
			}
			else if(i < 0 && j >= 0) {
				int sum = b.charAt(j) - '0' + carry;
				result = String.valueOf(sum % 2) + result;
				carry = sum / 2;
                j--;
			}
            //System.out.println(result);
		}
        if(carry == 1){
            result  = "1" + result;
        }
		return result;
    }
}
