//pow(x,n)
public class solution50 {
	public double myPow(double x, int n) {
        if(n==0)	return 1.0;
        if(Math.abs(x-0.0)<0.000001) {
        	return Double.POSITIVE_INFINITY;
        }
        if(Math.abs(x-1)<0.000001) {
        	return 1.0;
        }
        if(Math.abs(x+1)<0.000001) {
        	if((n&1)==0) return 1;
        	else	return -1;
        }
        int exp;
        if(n < 0)	exp = -n;
        else	exp = n;
        double result = x;
        while(exp != 1) {
        	if((exp&1) == 1) {	
        		result = result * x;
        	}
        	if(result)
        	x *= x;
        	exp = exp >> 1;
        }
        if(n > 0)	return result;
        else return 1/result;
    }
}
