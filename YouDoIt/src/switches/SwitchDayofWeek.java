/**
 * 
 */
package switches;
import java.util.Scanner;
/**
 * @author ZD131147
 *
 */
public class SwitchDayofWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String day;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a day during the week for your schedule >>>>  ");
		day = input.nextLine();
		switch(day)
		{
		case "Monday":
		    System.out.print("Reserve room for Friday meeting.");
		    break;
		case "Tuesday":
		case "tuesday":
			System.out.print("Meeting with Principal your fired.");
			break;
		case "Wednesday":
			System.out.print("Banana splits for everyone!");
			break;
		case "Thursday":
			System.out.print("Have to go to the hardware store.");
			break;
		case "Friday":
			System.out.print("Going to the shooting range.");
			break;
		case "Saturday":
			System.out.print("Going to sleep all day.");
			break;
		case "Sunday":
			System.out.print("Do everything I can to break computers");
			break;
			default:
				System.out.print("That day does not exist in the this universe my dear friend.");
				break;
				
			
		    
		}

	}

}
