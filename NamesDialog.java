import javax.swing.JOptionPane; // import the javax library...........Step 1

public class NamesDialog {
    public static void main(String[] args) {
        String firstName, lastName; // declare two string variables to store the names
        double hoursWorked;            // declare a double variable to store the hours worked
        double payRate;                // declare a double variable to store the pay rate per hour
        double grossPay;            // declare a double variable to store the gross pay
        // Get the user's first name....Step 2
        firstName = JOptionPane.showInputDialog("Enter your first name in the dialog box.");     
        // Get the user's last name
        lastName = JOptionPane.showInputDialog("Enter your last name in the dialog box.");
        // Get the hours worked as a string
        // converting the string value to return a double
        hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of hours worked in the dialog box."));                                                
        // Get the pay rate per hour as a string
        // converting the string value returned to a double
        payRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the pay rate per hour in the dialog box."));
        grossPay = payRate * hoursWorked;
        // Display the name and gross pay to the user.....Step 3
        JOptionPane.showMessageDialog(null, "Hello " + firstName + " "+ lastName + ". "+ "Your gross pay is: $"+ grossPay);
        // End the program.
        System.exit(0);
        /* Please note that you can find the methods for converting string to numbers
         * on page 99 in table 2-18
         */
        }

}