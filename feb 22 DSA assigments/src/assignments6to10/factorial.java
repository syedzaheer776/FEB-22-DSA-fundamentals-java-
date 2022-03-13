package assignments6to10;

public class factorial {
	 static int _fact(int n) {
	        
	        if (n == 1)
	            return 1;

	        return n * _fact(n - 1);
	    }

	    public static void main(String[] args) {
	        System.out.println(_fact(5));
	    }

}
