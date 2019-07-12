// integer to roman
public class solution12 {
	public String intToRoman(int num) {
		String result = "";
		int remain = num;
		for(int i = 0; i < remain/1000; i++) {
			result = result + "M";
		}
		remain = remain % 1000;
		
		if(remain/500 == 1) {
			if(remain%500 >= 400) {
				result = result + "CM";
			}
			else {
				result = result + "D";
				for(int i = 0; i < remain/100 - 5;i++) {
					result = result + "C";
				}
			}
		}
		else {
			if(remain >= 400) {
				result = result + "CD";
			}
			else {
				for(int i = 0; i < remain/100;i++) {
					result = result + "C";
				}
			}
		}
		remain = remain % 100;
		
		if(remain/50 == 1) {
			if(remain%50 >= 40) {
				result = result + "XC";
			}
			else {
				result = result + "L";
				for(int i = 0; i < remain/10 - 5;i++) {
					result = result + "X";
				}
			}
		}
		else {
			if(remain >= 40) {
				result = result + "XL";
			}
			else {
				for(int i = 0; i < remain/10;i++) {
					result = result + "X";
				}
			}
		}
		remain = remain % 10;
		
		if(remain/5 == 1) {
			if(remain%5 >= 4) {
				result = result + "IV";
			}
			else {
				result = result + "V";
				for(int i = 0; i < remain/10 - 5;i++) {
					result = result + "I";
				}
			}
		}
		else {
			if(remain >= 4) {
				result = result + "IV";
			}
			else {
				for(int i = 0; i < remain/10;i++) {
					result = result + "I";
				}
			}
		}
		
		return result;
    }
}
