package jan26;
import java.util.*;
import java.util.Scanner;

public class fact {
	 public static void main(String[] args) {
		 Scanner a = new Scanner(System.in);
		 int n1 = a.nextInt(); 
		 int f=1;
		 /*for(int num=1;num<=n1;num++) {
			 f=f*num;
			
		 }
		 System.out.println(f);*/
		 int b=1;
		 while(b<=n1) {
			 f=f*b;
			 b++;

			
		 }
		 System.out.println(f);
}
}