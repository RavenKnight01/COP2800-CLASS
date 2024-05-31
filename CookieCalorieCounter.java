import javax.swing.JOptionPane;

public class CookieCalorieCounter {

	public static void main(String[] args) {
		String userStringOutput;
		double userNumberOfCookies;
		double userNumberOfServings;
		double userNumberOfCalories;
		
		userStringOutput = JOptionPane.showInputDialog("Please enter the number of cookies");
		userNumberOfCookies = Double.parseDouble(userStringOutput);
		userNumberOfServings = (userNumberOfCookies / 40) * 10;
		userNumberOfCalories = (userNumberOfServings / 1) * 300;
		
		JOptionPane.showMessageDialog(null, userNumberOfCookies + " cookies is equal to " + userNumberOfCalories +
				" calories(" + userNumberOfServings + " Servings )");
		
		System.exit(0);
	}

}