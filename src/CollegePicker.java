import javax.swing.JOptionPane;

public class CollegePicker {

	public static void main(String[] args) {

		String college;
		String[] region = {"West Coast", "Midwest", "East Coast"};
		String[] snow = {"Yes", "No"};
		String rank;
		int rankNum;
		String[] division = {"D1", "D2", "D3"};
		String size; // # of students
		int sizeNum;
		String[] area = {"College Town", "Big City", "Middle of Nowhere"};
		double percent;
		double points = 0;

		college = JOptionPane.showInputDialog("What is the name of the college?");
		int location = JOptionPane.showOptionDialog(null, "In what region is the school located?", "Your choice",
				JOptionPane.PLAIN_MESSAGE, 0, null, region, region[0]);
		if (location == 0) {
			points = points + 2;
		} else if (location == 1) {
			points ++;
		} 

		int weather = JOptionPane.showOptionDialog(null, "Does it snow there?", "Your choice",
				JOptionPane.PLAIN_MESSAGE, 0, null, snow, snow[0]);		
		if (weather == 1) {
			points = + 2;
		}
		
		rank = JOptionPane.showInputDialog("What is the school's engineering rank?");
		rankNum = Integer.parseInt(rank);
		if (rankNum <= 15) {
			points = points + 2;
		} else if (rankNum <= 100) {
			points ++;
		}
		
		int sports =  JOptionPane.showOptionDialog(null, "What division is the football team?", "Your choice",
				JOptionPane.PLAIN_MESSAGE, 0, null, division, division[0]);
		if (sports == 0) {
			points = + 2;
		}
		
		size = JOptionPane.showInputDialog("How many students attend?");
		sizeNum = Integer.parseInt(size);
		if (sizeNum > 15000 && sizeNum < 40000) {
			points = + 2;
		}
		
		int city =  JOptionPane.showOptionDialog(null, "What type of city is the school located in?", "Your choice",
				JOptionPane.PLAIN_MESSAGE, 0, null, area, area[0]);
		if (city == 1) {
			points = points + 2;
		} else if (city == 0) {
			points ++;
		}
		
		percent = 100 * (points / 12);
		
		JOptionPane.showMessageDialog(null, college + " is a " + percent + "% fit for you");
		
	}

}
