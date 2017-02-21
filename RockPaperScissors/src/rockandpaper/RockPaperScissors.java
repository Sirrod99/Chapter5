/**
 * 
 */
package rockandpaper;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * @author ZD131147
 *
 */
public class RockPaperScissors {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
        String computerSide,
               userSide;

        JOptionPane.showMessageDialog(null, "How about we go \"Rock, Paper, Scissors?\"");
        
        computerSide = ComputerChoice();
        userSide = UserChoice();
        
        if (userSide != null)
        {
            JOptionPane.showMessageDialog(null, "The computer's choice is " + computerSide + ".");
            
            Winner(computerSide, userSide);
        }
        
        else
            JOptionPane.showMessageDialog(null, "Error: Improper User Entry. Please enter either" + 
                                        " 'rock', 'paper', or 'scissors'.");
    }
    
    public static String ComputerChoice()
    {
        byte computerChoice;
        
        String computerChoiceString = "";
        
        Random choiceGenerator = new Random();
        
        computerChoice = (byte)(choiceGenerator.nextInt(3) + 1);
        
        switch (computerChoice)
        {
        
            case 1:
            {
                computerChoiceString = "rock";
                break;
            }
        
            case 2:
            {
                computerChoiceString = "paper";
                break;
            }
        
            case 3:
            {
                computerChoiceString = "scissors";
                break;
            }
        
        }
        
        return computerChoiceString;
    }
    
    public static String UserChoice()
    {
        String userChoice,
               userChoiceLowerCase;
        
        userChoice =
                JOptionPane.showInputDialog("What object are you going for?");
        
        if (userChoice.equalsIgnoreCase("rock") || userChoice.equalsIgnoreCase("paper")
                || userChoice.equalsIgnoreCase("scissors"))
        {
            userChoiceLowerCase = userChoice.toLowerCase();
        }
        
        else
            userChoiceLowerCase = null;
        
        return userChoiceLowerCase;
    }
    
    public static void Winner(String computerSide, String userSide)
    {
        
        if (computerSide.equals(userSide))
            JOptionPane.showMessageDialog(null, "The game has to be played again, because we have a tie.");
        
        else if (computerSide.equalsIgnoreCase("rock") && userSide.equalsIgnoreCase("paper"))
            JOptionPane.showMessageDialog(null, "You win. Paper covers rock.");
        
        else if (computerSide.equalsIgnoreCase("rock") && userSide.equalsIgnoreCase("scissors"))
            JOptionPane.showMessageDialog(null, "You lose. Rock crushes scissors.");
        
        else if (computerSide.equalsIgnoreCase("paper") && userSide.equalsIgnoreCase("rock"))
            JOptionPane.showMessageDialog(null, "You lose. Paper covers rock.");
        
        else if (computerSide.equalsIgnoreCase("paper") && userSide.equalsIgnoreCase("scissors"))
            JOptionPane.showMessageDialog(null, "You win. Scissors cuts paper.");
        
        else if (computerSide.equalsIgnoreCase("scissors") && userSide.equalsIgnoreCase("rock"))
            JOptionPane.showMessageDialog(null, "You win. Rock crushes scissors.");
        
        else
            JOptionPane.showMessageDialog(null, "You lose. Scissors cuts paper.");
    }
}