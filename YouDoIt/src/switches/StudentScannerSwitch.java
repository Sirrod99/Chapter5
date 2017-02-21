/**
 * 
 */
package switches;


import javax.swing.JOptionPane;
/**
 * @author ZD131147
 *
 */
public class StudentScannerSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int studentNumber;
		String studentString;
		
		
		//Scanner input = new Scanner (System.in);
		
		//System.out.print("Please scan the student Id >>>>> ");
		//user = input.nextInt();
		studentString = (String)JOptionPane.showInputDialog(null, "Please scan the student Id >>>>>", "Enter User ID #",
				JOptionPane.QUESTION_MESSAGE, null,null,"");
		studentNumber = Integer.parseInt(studentString);
		
		if (studentNumber >= 100000 || studentNumber <= 4000000)
		{
			switch(studentNumber)
			{
			case 274896:
				JOptionPane.showMessageDialog(null, "Andrew McKenzie's Java Book, he is in the 10th grade");
			break;	
			case 274885:
				JOptionPane.showMessageDialog(null, "Charles Carlstom's Java Book, he is in the 12th grade");
				break;
			case 316282:
				JOptionPane.showMessageDialog(null, "Ress Alzahrani's Java Book, he is in the ?th grade");
			break;
			case 274884:
				JOptionPane.showMessageDialog(null, "Tatyana Vaughn's Java Book, he is in the ?th grade");
				break;
			case 133778:
				JOptionPane.showMessageDialog(null, "Nick Hasson's Java Book, he is in the 11th grade");
				break;
			case 131457:
				JOptionPane.showMessageDialog(null, "Kassie Remley's Java Book, he is in the 11th grade");
			    break;
			case 137412:
				JOptionPane.showMessageDialog(null, "Sebastian Frick's Java Book, he is in the ?th grade");
			    break;
			case 131147:
				JOptionPane.showMessageDialog(null, "Zach Dorris' Java Book, he is in the 11th grade");
				break;
			case 274887:
				JOptionPane.showMessageDialog(null, "Chase Kress' Java Book, he is in the ?th grade");
			    break;
			case 133225:
				JOptionPane.showMessageDialog(null, "Isaiah Ponciano's Java Book, he is in the ?th grade");
			    break;
			case 137428:
				JOptionPane.showMessageDialog(null, "Mason Hancock's Java Book, he is in the ?th grade");
				break;
				default:
					JOptionPane.showMessageDialog(null, "You do not exist my friend, goodbye");
					break;
					
				
				
				
				
			
			}
		}

	}

}
