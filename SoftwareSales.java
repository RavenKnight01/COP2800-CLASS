/*
A software company sells a package at the regular price of $99. 
Quantity discounts are given according to the following table:
Quantity   Discount 
1-9        No Discount
10-19      20%
20-49      30%
50-99      40%
100+       50%
Write a program that asks the user to enter the number of packages purchased. 
The program should then display the amount of the discount (if any) and the total amount of the purchase after the discount.
Hint: To calculate 20% of a value N, you can use the formula 0.2 * N.
*/
import java.util.Scanner;

public class SoftwareSales {

    public static void main(String[] args) {

        try (Scanner keyboard = new Scanner(System.in)) {
            int packagesPurchased;
            double discountRate = 0.0;
            double discountAmount;
            double totalCost;
            double packageCost = 99.0; // Regular price per package
            
            System.out.print("Enter number of packages purchased: ");
            packagesPurchased = keyboard.nextInt();
            
            if (packagesPurchased >= 10 && packagesPurchased <= 19) {
                discountRate = 0.2; //10-19      20%
            }
            else if (packagesPurchased >= 20 && packagesPurchased <= 49) {
                discountRate = 0.3; //20-49 30%
            }
            else if (packagesPurchased >= 50 && packagesPurchased <= 99) {
                discountRate = 0.4; //50-99 40%
            }
            else if (packagesPurchased >= 100) {
                discountRate = 0.5; //100+ 50%
            }
            
            discountAmount = packagesPurchased * packageCost * discountRate;
            totalCost = packagesPurchased * packageCost - discountAmount;
            
            System.out.printf("Your discount is: $%.2f%n", discountAmount);
            System.out.printf("Your total is: $%.2f%n", totalCost);
        }
    }
}