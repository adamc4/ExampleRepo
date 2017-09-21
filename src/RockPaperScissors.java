import javax.swing.JOptionPane;

public class RockPaperScissors {

	public static void main(String[] args) {

		String bet;
		String[] choices = { "Rock", "Paper", "Scissors" };
		int comp;
		int betSize;
		int money = 100;
		// rock = 0; paper = 1; scissors = 2

		do {

			comp = (int) (Math.random() * 3);
			
			int userMove = JOptionPane.showOptionDialog(null, "Rock, Paper, Scissors", "Your choice",
					JOptionPane.PLAIN_MESSAGE, 0, null, choices, choices[0]);

			bet = JOptionPane.showInputDialog("How much would you like to bet? You have $" + money);
			betSize = Integer.parseInt(bet);
			
			if (betSize > money) {
				JOptionPane.showMessageDialog(null, "Haha you bet $" + money);
				betSize = money;
			} else if (betSize < 1) {
				JOptionPane.showMessageDialog(null, "Haha you bet $1");
				betSize = 1;
			}
			
			if (userMove == 0 && comp == 0) {
				JOptionPane.showMessageDialog(null, "Both players played rock!");
			}

			if (userMove == 1 && comp == 1) {
				JOptionPane.showMessageDialog(null, "Both players played paper!");
			}

			if (userMove == 2 && comp == 2) {
				JOptionPane.showMessageDialog(null, "Both players played scissors!");
			}

			if (userMove == 0 && comp == 1) {
				JOptionPane.showMessageDialog(null, "Paper beats rock! Computer wins. You lose $" + betSize);
				money = money - betSize;
			}

			if (userMove == 0 && comp == 2) {
				JOptionPane.showMessageDialog(null, "Rock beats scissors! Player 1 wins. You win $" + betSize);
				money = money + betSize;
			}

			if (userMove == 1 && comp == 0) {
				JOptionPane.showMessageDialog(null, "Paper beats rock! Player 1 wins. You win $" + betSize);
				money = money + betSize;
			}

			if (userMove == 1 && comp == 2) {
				JOptionPane.showMessageDialog(null, "Scissors beats paper! Computer wins. You lose $" + betSize);
				money = money - betSize;
			}

			if (userMove == 2 && comp == 0) {
				JOptionPane.showMessageDialog(null, "Rock beats scissors! Computer wins. You lose $" + betSize);
				money = money - betSize;
			}

			if (userMove == 2 && comp == 1) {
				JOptionPane.showMessageDialog(null, "Scissors beats paper! Player 1 wins. You win $" + betSize);
				money = money + betSize;
			}

		} while (money > 0);

		JOptionPane.showMessageDialog(null, "You are broke! Game over!");
		
	}

}
