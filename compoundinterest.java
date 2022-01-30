package jan27;
import java.util.*;
public class compoundinterest {
	  public static void main(String args[]) {
		  Scanner s=new Scanner(System.in);
		  System.out.println("eneter principal");
	        double p = s.nextDouble();
	        System.out.println("enter rate");
	        double r = s.nextDouble();
	        r=r/100;
	        System.out.println("enter time");
	        double t=s.nextDouble();

	        System.out.println("enter numbers");
	        double n =s.nextDouble();
		       
	  
	        double CI= p *(Math.pow((1 + r/n), n*t));
	        
	          
	        System.out.println("Compound Interest is "+ CI);
	    }
	}


