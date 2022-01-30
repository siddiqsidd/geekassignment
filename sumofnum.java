package jan26;
import java.util.*;
public class sumofnum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int i=1;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println("sum till n is :" +sum);
	}

}
