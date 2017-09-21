import javax.swing.JOptionPane;

public class MultChoiceDialogBox {

	public static void main(String[] args) {

		double k = 7;
		double b = 2;
		double c = (double)(k/b);
		JOptionPane.showMessageDialog(null, c);
		
		
		String[] move = { "Rock", "Paper", "Scissors" };

		String userMove = (String) JOptionPane.showInputDialog(null, "Rock, Paper or Scissors?", "Your pick",
				JOptionPane.QUESTION_MESSAGE, null, move, move[0]);

		JOptionPane.showMessageDialog(null, userMove);
		
		if (userMove == "Rock") {
			JOptionPane.showMessageDialog(null, "You win!");
		}
	}

}
