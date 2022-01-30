package jan27;
import java.util.*;
public class perm_comb {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n, r, NCR, NPR;
	
	System.out.print("Please Enter n Value = ");
	n = sc.nextInt();
	System.out.print("Please Enter r Value = ");
	r = sc.nextInt();
	
	NCR = fact(n)/(fact(n - r) * fact(r));
	NPR = fact(n)/fact(n - r);
	
	System.out.println("NCR Value = " + NCR);
	System.out.println("NPR Value = " + NPR);
}

public static int fact(int number) {
	if(number == 0 || number == 1) {
		return 1;
	}
	else {
		return number * fact(number - 1);
	}
}
}

