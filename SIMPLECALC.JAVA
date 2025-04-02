import java.util.Scanner;

public class SimpleCalculator {

    // Main method to run the program
    public static void main(String[] args) {

        // Create an object of Scanner class to take input from the user
        Scanner scanner = new Scanner(System.in);

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
        switch (choice) {
            case 1:
                result = num1 + num2; // Addition
                System.out.println("The result of addition is: " + result);
                break;
            case 2:
                result = num1 - num2; // Subtraction
                System.out.println("The result of subtraction is: " + result);
                break;
            case 3:
                result = num1 * num2; // Multiplication
                System.out.println("The result of multiplication is: " + result);
                break;
            case 4:
                // Handle division case
                if (num2 != 0) {
                    result = num1 / num2; // Division
                    System.out.println("The result of division is: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;
            default:
                // Handle invalid choice
