// integer to roman
public class solution12 {
	public String intToRoman(int num) {
		int[] int_dict = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] roman_dict = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		for(int i = 0; i <= int_dict.length;i++) {
			if(int_dict[i] <= num) {
				return roman_dict[i] + intToRoman(num-int_dict[i]);
			}
		}
		return "";
    }
}
