import java.util.Scanner;

// Class for performing calculator operations
class SimpleCalculator {

    // Method to perform addition
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to perform subtraction
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to perform multiplication
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to perform division
    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}

// Main class that runs the program
public class Main {

    public static void main(String[] args) {

        // Create an object of Scanner class to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an object of SimpleCalculator to perform operations
        SimpleCalculator calculator = new SimpleCalculator();

        // Display the menu of operations to the user
        System.out.println("Welcome to the Simple Calculator!");
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter the number corresponding to your operation (1/2/3/4): ");
        
        // Take the user's choice as input
        int choice = scanner.nextInt();

        // Ask the user for two numbers to perform the operation
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Declare a variable to store the result
        double result;

        // Perform the chosen operation using a switch-case structure
        try {
            switch (choice) {
                case 1:
                    result = calculator.add(num1, num2); // Addition
                    System.out.println("The result of addition is: " + result);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2); // Subtraction
                    System.out.println("The result of subtraction is: " + result);
                    break;
                case 3:
                    result = calculator.multiply(num1, num2); // Multiplication
                    System.out.println("The result of multiplication is: " + result);
                    break;
                case 4:
                    result = calculator.divide(num1, num2); // Division
                    System.out.println("The result of division is: " + result);
                    break;
                default:
                    // Handle invalid choice
                    System.out.println("Invalid choice! Please select a number between 1 and 4.");
            }
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println(e.getMessage());
        }

        // Close the scanner object to prevent memory leaks
        scanner.close();
    }
}

