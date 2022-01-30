package jan28;

public class pyramid {
	 public static void main(String[] args) {
		    int rows = 5, k = 0;

		    for (int i = 1; i <= rows; ++i, k = 0) {
		      for (int a = 1; a <= rows - i; a++) {
		        System.out.print("  ");
		      }

		      while (k != 2 * i - 1) {
		        System.out.print("* ");
		        k++;
		      }

		      System.out.println();
		    }
		  }
}
