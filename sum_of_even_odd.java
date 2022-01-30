package jan27;
import java.util.*;
public class sum_of_even_odd {
	 public static void main(String args[])
	   {
		 Scanner s=new Scanner(System.in);
	      int number = s.nextInt();
	       int evenSum=0;
	       int oddSum=0;
	      while(number!=0)
	        {
	            int rem=number%10;
	            if(rem%2==0)
	            {
	                evenSum=evenSum+rem;
	            }
	            else
	            {
	                oddSum=oddSum+rem;
	            }
	            
	            number=number/10;
	        }
	      System.out.println("Sum of even digits: "+ evenSum);
	      System.out.println("Sum of odd digits: "+ oddSum);
	   }

}
