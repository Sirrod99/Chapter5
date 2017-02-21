/**
 * 
 */
package youDoIt;
import java.util.Scanner;
/**
 * @author ZD131147
 *
 */
public class OtherTime {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double rate;
		double hoursWorked;
	    double regularPay;
	    double overtimePay;
	    final int FULL_WEEK = 32;
	    final double OT_RATE = 2.0;
	    final double GovmentGetHalf = .5;
	    double afterTax;
	    Scanner keyboard = new Scanner(System.in);
	    System.out.print("How many hours did you work this week? ");
	    hoursWorked = keyboard.nextDouble();
	    System.out.print("What is you regular pay rate?");
	    rate = keyboard.nextDouble();
	    if(hoursWorked > FULL_WEEK)
	    {	
           regularPay = FULL_WEEK * rate;
           overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rate;
          afterTax = overtimePay * GovmentGetHalf;
	    }
	    else
	    {
	    	regularPay = hoursWorked * rate;
		    overtimePay = 0.0;
		    afterTax = regularPay * GovmentGetHalf;
		    
           
	    }
	    System.out.println("Regular pay is " + regularPay + "\nOvertime pay is " + overtimePay);
	     
	     
	    
	    
	    
	    

	}

}
