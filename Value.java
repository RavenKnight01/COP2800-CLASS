public class Value {
    public static void main(String[] args) {
        int a = 11; //variable a starts with the value 11
        int b = 2; //variable b starts with the value 2
        final int c = 3; //variable starts with a fixed value of 3
        double d; // variable d stores a floating point value
        boolean e = true; //variable e starts with the value true
        String word = "This is Java"; //the variable word starts with the value "This is Java"

        a *= b; //store the value of a times b in a
        d = a % c; //divide a by c and store the remainder in d

        System.out.print(" The values of a, b, and c is: " + a + " " + b + " " + c); //display on the same line the values in a, b, and c with the string "The values of a, b, and c is: "
        System.out.printf("\n The value of d is: %.3f", d); //value of d with string "The value of d is:" with 3 decimal places
        System.out.println("\n The value of e is: " + e); //value of e with string "The value of e is:" followed by the value of e
        System.out.println(" The value of word is: " + word); // value of word with string "The value of word is:" followed by the value of word
        System.out.print(" The values of a, d, and word is: " + a + " " + d + " " + word); // display on same line the values of a, d, and word with string "The values of a, d, and word is:" followed by the value
        System.out.print("\n The length of word is: " + word.length()); //display same line the length of word with the string "The length of word is:" followed by the value
        System.out.println("\n The length of word is: " + word.length() + " Word converted to uppercase is: " + word.toUpperCase()); //o) Display on the SAME line the length of word and the string word converted to 
        //uppercase with the string “ The length of word is:” followed by the length of word then “Word converted to uppercase is:” followed by the converted string, on the screen
        System.out.println("The seventh character in word is: " + word.charAt(6)); //display 7th character in word
    }
}
