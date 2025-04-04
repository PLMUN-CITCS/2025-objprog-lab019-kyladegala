import java.util.Scanner;

public class FactorialCalculator {

    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = -1;

        // Loop until a valid non-negative integer is entered
        while (number < 0) {
            System.out.print("Enter a non-negative integer: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
                // Check if the number is non-negative
                if (number < 0) {
                    System.out.println("Error: The number must be non-negative.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid non-negative integer.");
            }
        }

        return number;
    }

    // Method to calculate the factorial of a given non-negative integer
    public static long calculateFactorial(int n) {
        // Handle the base case where n is 0
        if (n == 0) {
            return 1; // This is the base case for 0! = 1
        }

        long factorial = 1;
        // Calculate the factorial using a loop
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Get a non-negative integer from the user
        int number = getNonNegativeInteger();

        // Calculate the factorial of the number
        long factorial = calculateFactorial(number);

        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    } // <-- Closing brace for the main method

} // <-- Closing brace for the FactorialCalculator class

