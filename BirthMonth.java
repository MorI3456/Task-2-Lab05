

import java.util.Scanner;

// Class for Problem 2: BirthMonth
class Problem2 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their birth month
        System.out.print("Enter your birth month (1-12): ");

        // Check if the user input is an integer
        if (in.hasNextInt()) {
            int month = in.nextInt(); // Reading the input as an integer

            // Check if the month is within the valid range 1 to 12
            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month); // Output the valid month
            } else {
                System.out.println("You entered an incorrect month value: " + month); // Output error for invalid month
            }
        } else {
            String trash = in.next(); // Capture invalid input as a String
            System.out.println("You entered an incorrect value: " + trash); // Error message for non-integer input
        }
    }
}
