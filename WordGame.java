import javax.swing.JOptionPane;

public class WordGame {
	public static void main(String[] args) {
	 String name = JOptionPane.showInputDialog("Enter your name: ");
	 String age = JOptionPane.showInputDialog("Enter your age: ");
	 String city = JOptionPane.showInputDialog("Enter the name of a city: ");
	 String college = JOptionPane.showInputDialog("Enter the name of a college: ");
	 String profession = JOptionPane.showInputDialog("Enter profession: ");
	 String animal = JOptionPane.showInputDialog("Enter a type of animal: ");
	 String petname = JOptionPane.showInputDialog("Enter a pet name: ");
	 JOptionPane.showMessageDialog(null, "There once was a person named " + name + " who lived in " + city + ". " +
	 "At the age of " + age + ", " + name + " went to college at " + college + ". " + name + " graduated and went to work as a "
	 + profession + ". " + "Then, " + name + " adopted a(n) " + animal + " named " + petname + ". " +
	 "They both lived happily ever after!");
	}
 }