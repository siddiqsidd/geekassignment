package jan26;

import java.util.Scanner;

public class mul_tables {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a=s.nextInt();
		//for(int i=1;i<=10;i++) {
		int i=1;
		while(i<=10) {
		System.out.println(a+"*"+i + "="+ a*i);
			i++;
		}
	}

}
