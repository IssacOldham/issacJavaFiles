
public class RandomGame {

	import javax.swing.JOptionPane;

	class NumberGuess{
		public static void main( String [] arg){
			// This statement will produce an integer 1-10(inclusive)
			int randNum = (int)(Math.random() * 10 + 1);
			String getGuess = JOptionPane.showInputDialog("I am thinking of a number between 1-10,\n\n What is it ???");
			int guess = Integer.parseInt(getGuess);

			String response;
			if (guess == randNum){
				response = " Great guess you are correct ";
			}else{
				response = "Sorry, incorrect \n\n The number is..   " + randNum;
			}
			JOptionPane.showMessageDialog(null, response);
			System.exit(0);
		}
	}