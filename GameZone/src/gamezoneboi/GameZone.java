/**
 * 
 */
package gamezoneboi;
import javax.swing.JOptionPane;
/**
 * @author zd131147
 *
 */
public class GameZone {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String guessString;
		int random;
		int guess;
		final int MIN = 1;
		final int MAX = 10;
		boolean isMatch;
		
		random = MIN + (int)(Math.random() * MAX);
		guessString = JOptionPane.showInputDialog(null, "Guess my number " + MIN + " and " + MAX + " Random guess", " ", JOptionPane.INFORMATION_MESSAGE);
		
		guess = Integer.parseInt(guessString);
		
		isMatch = guess == random;
		
		JOptionPane.showMessageDialog(null, "Your guess was "+ (random - guess) + " numbers away from the random number");
		
		JOptionPane.showMessageDialog(null, "The number was " + random + ". The result is " + isMatch + ".");
		
		
		
		
		

	}

}
