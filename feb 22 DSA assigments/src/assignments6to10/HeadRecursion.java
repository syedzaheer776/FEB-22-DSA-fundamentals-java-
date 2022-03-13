package assignments6to10;

public class HeadRecursion {
	 static void printDec(int i) {
	        
	        if (i >= 76) {
	            System.out.println(i);
	            return;
	        }

	        printDec(i + 2);
	        System.out.println(i);
	    }

	    public static void main(String[] args) {
	        
	        printDec(2);
	    }
}
