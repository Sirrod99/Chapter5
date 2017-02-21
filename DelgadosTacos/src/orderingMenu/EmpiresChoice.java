/**
 * 
 */
package orderingMenu;
import java.util.Scanner;
/**
 * @author ZD131147
 *
 */
public class EmpiresChoice {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
        //String burrito, taco, churro, enchiladas, tamales, fajita, soda, bobaFet, lightSaber, jarJarBinks;
        double tacoPrice = 1.49;
    	double burritoPrice = 2.49;
    	double sodaPrice = .49;
    	double secretItemSteakPrice = 9.99;
    	double tacoOrdered;
    	double enchiladasPrice = 2.49;
    	double tamalesPrice = 2.99;
        double fajitaPrice = 3.99;
        double churroPrice = 5.99;
    	double burritoOrdered;
    	double totalPrice;
    	double totalPriceWithTax;
    	double fajitaOrdered;
    	double churroOrdered;
    	double enchiladasOrdered;
    	double tamalesOrdered;
    	double secretItemSteakOrdered;
    	double sodaOrdered;
    	double bobaFetsPrice = 599999.99;
    	double bobaFetsOrdered;
    	double lightSaberPrice = 749.99;
    	double lightSaberOrdered;
    	double jarJarBinksPrice = .01;
    	double jarJarBinksOrdered;
    	int orderNumber;
    	
    	menu();
    	tacoTruck();
    	Scanner inputDevice = new Scanner(System.in);
    	
    	System.out.println("Welcome to Galactic Express >>>>>");
    	System.out.println("Please order from our menu from above >>>>>");
    	orderNumber = inputDevice.nextInt();
    	
    	if(orderNumber == 1)
    	{
    		System.out.println("How many tacos do you want? >>>>>");
        	tacoOrdered= inputDevice.nextDouble();
        	inputDevice.nextLine();
        	totalPrice = (tacoPrice * tacoOrdered);
        	System.out.println("You ordered " + tacoOrdered + " tacos, " + totalPrice);
    	}
        	if(orderNumber == 2)
        	{
        		System.out.println("How many burritos do you want? >>>>>");
            	burritoOrdered = inputDevice.nextDouble();
            	inputDevice.nextLine();
            	totalPrice = (burritoPrice * burritoOrdered);
            	System.out.println("You ordered " + burritoOrdered + " burrito/s, " + totalPrice);
        	}
            	if(orderNumber == 6)
            	{
            		inputDevice = new Scanner(System.in);
                	System.out.println("How many churros do you want? >>>>>");
                	churroOrdered= inputDevice.nextDouble();
                	inputDevice.nextLine();
                	totalPrice = (churroPrice * churroOrdered);
                	System.out.println("You ordered " + churroOrdered + " churro/s, " + totalPrice);
            	}
                	if(orderNumber == 4)
                	{
                		inputDevice = new Scanner(System.in);
                    	System.out.println("How many enchiladas do you want? >>>>>");
                    	enchiladasOrdered= inputDevice.nextDouble();
                    	inputDevice.nextLine();
                    	totalPrice = (enchiladasPrice * enchiladasOrdered);
                    	System.out.println("You ordered " + enchiladasOrdered + " enchilada/s, " + totalPrice);
                	}
                    	if(orderNumber == 5)
                    	{
                    		inputDevice = new Scanner(System.in);
                        	System.out.println("How many tamales do you want? >>>>>");
                        	tamalesOrdered= inputDevice.nextDouble();
                        	inputDevice.nextLine();
                        	totalPrice = (tamalesPrice * tamalesOrdered);
                        	System.out.println("You ordered " + tamalesOrdered + " tamale/s, " + totalPrice);
                    	}
                        	if(orderNumber == 7)
                        	{
                        		inputDevice = new Scanner(System.in);
                            	System.out.println("How many fajitas do you want? >>>>>");
                            	fajitaOrdered= inputDevice.nextDouble();
                            	inputDevice.nextLine();
                            	totalPrice = (fajitaPrice * fajitaOrdered);
                            	System.out.println("You ordered " + fajitaOrdered + " fajita/s, " + totalPrice);
                        	}
                            	if(orderNumber == 3)
                            	{
                            		inputDevice = new Scanner(System.in);
                                	System.out.println("How many sodas do you want? >>>>>");
                                	sodaOrdered= inputDevice.nextDouble();
                                	inputDevice.nextLine();
                                	totalPrice = (sodaPrice * sodaOrdered);
                                	System.out.println("You ordered " + sodaOrdered + " soda/s, " + totalPrice);
                            	}
                                	if(orderNumber == 8)
                                	{
                                		inputDevice = new Scanner(System.in);
                                    	System.out.println("How many Boba Fets do you want? >>>>>");
                                    	bobaFetsOrdered= inputDevice.nextDouble();
                                    	inputDevice.nextLine();
                                    	totalPrice = (bobaFetsPrice * bobaFetsOrdered);
                                    	System.out.println("You ordered " + bobaFetsOrdered + " Boba Fet/s, " + totalPrice);
                                	}
                                    	if(orderNumber == 9)
                                    	{
                                    		inputDevice = new Scanner(System.in);
                                        	System.out.println("How many light sabers do you want? >>>>>");
                                        	lightSaberOrdered= inputDevice.nextDouble();
                                        	inputDevice.nextLine();
                                        	totalPrice = (lightSaberPrice * lightSaberOrdered);
                                        	System.out.println("You ordered " + lightSaberOrdered + " lightSaber/s, " + totalPrice);
                                    	}
                                        	if(orderNumber == 10)
                                        	{
                                        		inputDevice = new Scanner(System.in);
                                            	System.out.println("How many Jar Jar Binks' do you want? >>>>>");
                                            	jarJarBinksOrdered= inputDevice.nextDouble();
                                            	inputDevice.nextLine();
                                            	totalPrice = (jarJarBinksPrice * jarJarBinksOrdered);
                                            	System.out.println("You ordered " + jarJarBinksOrdered + " jarJarBinks/s, " + totalPrice);
                                        	}	
                                            	if(orderNumber == 42)
                                            	{
                                            		inputDevice = new Scanner(System.in);
                                                	System.out.println("How many steaks do you want? >>>>>");
                                                	secretItemSteakOrdered= inputDevice.nextDouble();
                                                	inputDevice.nextLine();
                                                	totalPrice = (secretItemSteakPrice * secretItemSteakOrdered);
                                                	System.out.println("You ordered " + secretItemSteakOrdered + " steak/s, " + totalPrice);
                                            	}
                  
    	/**
    	
    	totalPrice = (tacoPrice * tacoOrdered) + (burritoOrdered * burritoPrice) + (sodaPrice * sodaOrdered) + (fajitaPrice * fajitaOrdered) + 
    			(enchiladasPrice * enchiladasOrdered) + (churroPrice * churroOrdered) + (tamalesPrice * tamalesOrdered) + 
    			(bobaFetsPrice * bobaFetsOrdered + (lightSaberPrice * lightSaberOrdered) + (jarJarBinksPrice * jarJarBinksOrdered) + (secretItemSteakPrice * secretItemSteakOrdered));
    	
    	System.out.println("You ordered " + tacoOrdered + " Tacos, " + burritoOrdered +" burritos,  " + sodaOrdered + " \rsodas, " + fajitaOrdered + " fajitas, " +
    	enchiladasOrdered + " enchiladas, " + churroOrdered + " churros, " + tamalesOrdered + " tamales, " + bobaFetsOrdered + " \rBoba Fet/s, " +
    			lightSaberOrdered + " light saber/s, " + jarJarBinksOrdered + "Jar Jar Binks " + secretItemSteakOrdered + " steak/s, for the total price of " + totalPrice);
    	
    	totalPriceWithTax = totalPrice * 1.075;
    	System.out.println("Total with tax is " + totalPriceWithTax);*/
    	
	}

	
		
	

	public static void menu()
	{
		System.out.println();
		System.out.println();
		System.out.println("*********************************************");
		System.out.println();
		System.out.println(                "Tacos are 1.49  #1"               );
		System.out.println(              "Burritos are 2.49 #2"              );
		System.out.println(               "Sodas cost 0.49 #3 "               );
		System.out.println(            "Enchiladas cost 2.49 #4"             );
		System.out.println(              "Tamales cost 2.99 #5"              );
		System.out.println(             "Churros cost 5.99 #6"               );
		System.out.println(             "Fajitas cost 3.99 #7"               );
		System.out.println(         "Boba Fet costs 599999.99 #8"            );
		System.out.println(         "Light Sabers cost 749.99 #9"            );
		System.out.println(          "Jar Jar Binks cost .01 #10"             );
		System.out.println();
		System.out.println("*********************************************");
		System.out.println();
		System.out.println();
}
public static void salesTax ()
{
	double salesTax = 1.075;
	
}
public static void tacoTruck()
{

	System.out.println("****************************************************************");
	System.out.println("**                                                            **");	
	System.out.println("*                                                              *");
	System.out.println("*                            FOOD!                              *");
	System.out.println("*                                                              *");
	System.out.println("*                   Totally Not The Empire                     *");
	System.out.println("*                                                              *");
	System.out.println("*                         No Refunds!                          **************");
	System.out.println("*                                                              *            *");
	System.out.println("*                                                              *             *");
	System.out.println("*                                                              *              *");
	System.out.println("*                                                              *               *");
	System.out.println("*                                                              *               *");
	System.out.println("*                                                              *             *");
	System.out.println("*                                                              *             *");
	System.out.println("*                                                              ***************");
	System.out.println("***00000000*******************************************00000000***");
	System.out.println("   oooooooo                                           oooooooo   ");
	System.out.println("   oooooooo                                           oooooooo   ");
	System.out.println("   oooooooo                                           oooooooo   ");
	System.out.println("   oooooooo                                           oooooooo   ");
	System.out.println("   oooooooo                                           oooooooo   ");
	System.out.println("   oooooooo                                           oooooooo   ");
	System.out.println("   oooooooo                                           oooooooo   ");
	System.out.println("   oooooooo                                           oooooooo   ");
	System.out.println("   oooooooo                                           oooooooo   ");
	System.out.println("   oooooooo                                           oooooooo   ");
	System.out.println("   oooooooo                                           oooooooo   ");
	System.out.println("   oooooooo                                           oooooooo   ");
	System.out.println("   oooooooo                                           oooooooo   ");
	System.out.println(" 00oooooooo00                                       00oooooooo00   ");
	System.out.println(" 00oooooooo00                                       00oooooooo00   ");
	System.out.println("000oooooooo000                                     000oooooooo000   ");
	}

}
