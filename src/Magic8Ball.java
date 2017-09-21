import javax.swing.JOptionPane;

public class Magic8Ball {

	public static void main(String[] args) {

		int userNum, num;
		String response;
		
		do {
			
			JOptionPane.showInputDialog("Ask the magic 8 ball a question!");
			num = (int)(Math.random() * 6);
			
			if (num == 0) {
				JOptionPane.showMessageDialog(null, "Without a doubt");
			} else if (num == 1) {
				JOptionPane.showMessageDialog(null, "Cannot predict now");
			} else if (num == 2) {
				JOptionPane.showMessageDialog(null, "Don't count on it");
			} else if (num == 3) {
				JOptionPane.showMessageDialog(null, "Outlook good");
			} else if (num == 4) {
				JOptionPane.showMessageDialog(null, "Yes definitely");
			} else {
				JOptionPane.showMessageDialog(null, "Ask again later");
			}
			
			response = JOptionPane.showInputDialog("Type 1 to ask another question");
			userNum = Integer.parseInt(response);
			
		} while (userNum == 1);
		
	}

}
