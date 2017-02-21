/**
 * 
 */
package orderingMenu;
import java.util.Scanner;
   
/**
 * @author zd131147
 *
 */
public class Tacos {
    private static Scanner inputDevice;
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
        String burrito, taco, churro, enchiladas, tamales, fajita, soda, bobaFet, lightSaber, jarJarBinks;
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
    	
    	menu();
    	tacoTruck();
    	inputDevice = new Scanner(System.in);
    	System.out.println("How many tacos do you want? >>>>>");
    	tacoOrdered= inputDevice.nextDouble();
    	
    	System.out.println("How many burritos do you want? >>>>>");
    	burritoOrdered = inputDevice.nextDouble();
    	inputDevice.nextLine();
    	
    	inputDevice = new Scanner(System.in);
    	System.out.println("How many churros do you want? >>>>>");
    	churroOrdered= inputDevice.nextDouble();
    	
    	inputDevice = new Scanner(System.in);
    	System.out.println("How many enchiladas do you want? >>>>>");
    	enchiladasOrdered= inputDevice.nextDouble();
    	
    	inputDevice = new Scanner(System.in);
    	System.out.println("How many tamales do you want? >>>>>");
    	tamalesOrdered= inputDevice.nextDouble();
    	
    	inputDevice = new Scanner(System.in);
    	System.out.println("How many fajitas do you want? >>>>>");
    	fajitaOrdered= inputDevice.nextDouble();
    	
    	inputDevice = new Scanner(System.in);
    	System.out.println("How many sodas do you want? >>>>>");
    	sodaOrdered= inputDevice.nextDouble();
    	
    	inputDevice = new Scanner(System.in);
    	System.out.println("How many Boba Fets do you want? >>>>>");
    	bobaFetsOrdered= inputDevice.nextDouble();
    	
    	inputDevice = new Scanner(System.in);
    	System.out.println("How many light sabers do you want? >>>>>");
    	lightSaberOrdered= inputDevice.nextDouble();
    	
    	inputDevice = new Scanner(System.in);
    	System.out.println("How many Jar Jar Binks' do you want? >>>>>");
    	jarJarBinksOrdered= inputDevice.nextDouble();
    	
    	inputDevice = new Scanner(System.in);
    	System.out.println("How many steaks do you want? >>>>>");
    	secretItemSteakOrdered= inputDevice.nextDouble();
    	
    	totalPrice = (tacoPrice * tacoOrdered) + (burritoOrdered * burritoPrice) + (sodaPrice * sodaOrdered) + (fajitaPrice * fajitaOrdered) + 
    			(enchiladasPrice * enchiladasOrdered) + (churroPrice * churroOrdered) + (tamalesPrice * tamalesOrdered) + 
    			(bobaFetsPrice * bobaFetsOrdered + (lightSaberPrice * lightSaberOrdered) + (jarJarBinksPrice * jarJarBinksOrdered) + (secretItemSteakPrice * secretItemSteakOrdered));
    	
    	System.out.println("You ordered " + tacoOrdered + " Tacos, " + burritoOrdered +" burritos,  " + sodaOrdered + " \rsodas, " + fajitaOrdered + " fajitas, " +
    	enchiladasOrdered + " enchiladas, " + churroOrdered + " churros, " + tamalesOrdered + " tamales, " + bobaFetsOrdered + " \rBoba Fet/s, " +
    			lightSaberOrdered + " light saber/s, " + jarJarBinksOrdered + "Jar Jar Binks " + secretItemSteakOrdered + " steak/s, for the total price of " + totalPrice);
    	
    	totalPriceWithTax = totalPrice * 1.075;
    	System.out.println("Total with tax is " + totalPriceWithTax);
    	
	}

	
		
	

	public static void menu()
	{
		System.out.println();
		System.out.println();
		System.out.println("*********************************************");
		System.out.println();
		System.out.println(                "Tacos are 1.49"               );
		System.out.println(              "Burritos are 2.49"              );
		System.out.println(               "Sodas cost 0.49"               );
		System.out.println(            "Enchiladas cost 2.49"             );
		System.out.println(              "Tamales cost 2.99"              );
		System.out.println(             "Churros cost 5.99"               );
		System.out.println(             "Fajitas cost 3.99"               );
		System.out.println(         "Boba Fet costs 599999.99"            );
		System.out.println(         "Light Sabers cost 749.99"            );
		System.out.println(          "Jar Jar Binks cost .01"             );
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