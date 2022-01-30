package jan27;
import java.util.*;
public class distance_bwn_2points {
	public static void main(String arg[])	{ 
	         double dis;
	         Scanner sc=new Scanner(System.in);
 	           int x1=sc.nextInt();
	           int y1=sc.nextInt();
	           int   x2=sc.nextInt();	         
               int   y2=sc.nextInt();
	  	     dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	 	    	 	    
  	         System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+") is :" +dis);
 
	}
 
}

