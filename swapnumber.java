package jan26;
import java.util.*;

public class swapnumber {
 public static void main(String []args) {
	 Scanner s=new Scanner(System.in);
	 int a=s.nextInt();
	 int b=s.nextInt();
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 System.out.println("swap numbers : " + a + " " +b);
 }
}
