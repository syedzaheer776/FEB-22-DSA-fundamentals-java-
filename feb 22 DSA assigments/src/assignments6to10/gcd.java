package assignments6to10;

public class gcd {
	 static int _gcd(int dividend, int divisor) {
	        
	        if (divisor == 0)
	            return dividend;

	        return _gcd(divisor, dividend % divisor);
	    }

	    

	    public static void main(String[] args) {
	        System.out.println(_gcd(4, 8));
	        
	    }

}
