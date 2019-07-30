//divide two integers
public class solution29 {
	public int divide(int dividend, int divisor) {
		boolean sign = (dividend < 0) ^ (divisor > 0) ? true:false;
        if(divisor == -1){
            if(dividend == Integer.MIN_VALUE)
                return Integer.MAX_VALUE;
            else
                return -dividend;
        }
        if(divisor == 1){
            return dividend;
        }
		long m = Math.abs((long)dividend);
		long n = Math.abs((long)divisor);
        if(m < n)	return 0;
		int result = 0;
		while(m >= n) {
			long t = n;
			long p = 1;
            while(m > (t << 1)) {
				t <<= 1;
				p <<= 1;
			}
            m -= t;
			result += (int)p;
		}
		return sign?result:-result;
    }
}
