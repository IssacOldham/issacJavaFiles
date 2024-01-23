package box;

import javax.swing.JOptionPane;

public class Dialogbox {

	public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Pick A Number One Through Ten");
		
		JOptionPane.showMessageDialog(null,"The number is "+
		          (1 + (int)(Math.random() * 10)));

	}

}
