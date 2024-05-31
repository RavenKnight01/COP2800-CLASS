
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileLetterCounter {
    public static void main(String[] args) {
        String fileName;
        char characterToCount;
        int count;

        // Ask the user to enter the name of the file
        try (Scanner console = new Scanner(System.in)) {
            // Ask the user to enter the name of the file
            System.out.print("Enter file name: ");
            fileName = console.nextLine();
            // Ask the user to enter a character to count
            System.out.print("Enter character to count: ");
            String input = console.nextLine();
            characterToCount = input.charAt(0);
            count = 0; // Variable to hold the character count
            try {
                // Read through the file and count occurrences of the character
                try (Scanner fileScanner = new Scanner(new File(fileName))) {
                    // Read through the file and count occurrences of the character
                    while (fileScanner.hasNextLine()) {
                        String line = fileScanner.nextLine();
                        for (int i = 0; i < line.length(); i++) {
                            if (line.charAt(i) == characterToCount) {
                                count++;
                            }
                        }
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
                return;
            }
        System.out.println("The character '" + characterToCount + "' appears in the file " + fileName + " " + count + " times.");
    }
}
}