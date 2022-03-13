package assignments6to10;

public class doublepow {
	 static double _pow(double a, int b) {
	        if (b == 0)
	            return 1;

	        double res = _pow(a, b / 2);

	        if (b % 2 != 0) {
	            return (a * res * res);
	        } else
	            return (res * res);
	    }

	    public static void main(String[] args) {
	        System.out.println(_pow(2.00000, 10));

}
}