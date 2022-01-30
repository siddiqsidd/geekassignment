package jan27;
import java.util.*;
public class leapyear {
	public static void main(String []args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		if((n % 400 ==0) || (n %4 == 0 && n % 100 == 0)) {
			System.out.println("it is a leap year");
			
		}
		else
			System.out.println("not a leap year ");

}
}