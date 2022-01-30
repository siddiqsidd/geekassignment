package jan27;
import java.util.*;
public class reverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r; int reverse=0;
		while(n>0) {
			r=n%10;
			reverse=(reverse*10)+r;
			n=n/10;
		}
		System.out.println("reverse number is : "+reverse);
	}

}
