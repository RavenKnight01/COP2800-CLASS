import javax.swing.JOptionPane;

public class AlienGreeting {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Greetings Earthling."); //Display in a message “Greetings Earthling.”
		String name = JOptionPane.showInputDialog("What is your name?"); //Display a dialog box “What is your name?”
		JOptionPane.showMessageDialog(null, "Hello " + name + "."); //Display in a message “Hello (person’s name e.g. Joe).”
		String response = JOptionPane.showInputDialog("Do you like this class?"); //Display an input dialog box “Do you like this class?”
		JOptionPane.showMessageDialog(null, "Did you say " + response + "."); //Display in a message “Did you say (person’s response e.g. yes).”
		JOptionPane.showMessageDialog(null, "The feeling is mutual."); //Display in a message “The feeling is mutual.”
 }
}