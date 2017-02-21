/**
 * 
 */
package pizzaChoice;
import java.util.Scanner;

/**
 * @author ZD131147
 *
 */
public class PizzaChoice2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	String choiceYes; //user is selecting that they made a choice	
    String size;
	String pizzaKind = null;
	double smallCost = 3.99;
	double mediumCost = 6.99;
	double largeCost = 9.99;
	
	
	
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Would you like a pizza? Yes or No? >>>>>");
	choiceYes = input.nextLine();
	//if you want pizza or not
	if("Yes".equals(choiceYes) || "yes".equals(choiceYes))
	{
		System.out.print("You said " + choiceYes + " to have a pizza.");
		System.out.print("Please choose a size, small, medium, or large >>>>");
		size = input.nextLine();
		if("Small".equals(size) || "Medium".equals(size) || "Large".equals(size))
		{
			System.out.print("You said " + size + " pizza size.");
			System.out.print("What kind of pizza do you want? Pepperoni, Sausage, Mushroom, Pineapple, and or Cheese? >>>>");
			pizzaKind = input.nextLine();
			if("Pepperoni".equals(pizzaKind)||"Sausage".equals(pizzaKind) || "Cheese".equals(pizzaKind) || "Mushroom".equals(pizzaKind) || "Pineapple".equals(pizzaKind))
			
			{
				System.out.print("You said " + pizzaKind + " that sounds delicious! ");
				System.out.print("Your order consists of " + size + " pizza, would the topping of " + pizzaKind);
				if("small".equals(size))
				{
					System.out.print("The cost of your pizza is $" + smallCost);
					
				}
				if("medium".equals(size))
				{
					System.out.print("The cost of your pizza is $" + mediumCost);
				}
				if("large".equals(size))
				{
					System.out.print("The cost of your pizza is $" + largeCost);
						
				}
				}
				
			}
		}
		
	}
	}


