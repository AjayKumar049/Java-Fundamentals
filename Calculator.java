import java.util.Scanner;  

public class Calculator {
    public static void main(String[] args) {  
        char operator;
        double number1, number2, result;

        // Create an object of Scanner 
        Scanner input = new Scanner(System.in);

        // Ask users to enter an operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // Ask users to enter numbers
        System.out.println("Enter first number: ");
        number1 = input.nextDouble();

        System.out.println("Enter second number: ");
        number2 = input.nextDouble();

        // Perform operation based on the operator
        if (operator == '+') {
            result = number1 + number2;
            System.out.println("Result: " + result);
        } else if (operator == '-') {
            result = number1 - number2;
            System.out.println("Result: " + result);
        } else if (operator == '*') {
            result = number1 * number2;
            System.out.println("Result: " + result);
        } else if (operator == '/') {
            if (number2 != 0) {
                result = number1 / number2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error! Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator! Please use +, -, *, or /.");
        }

        input.close(); // Close the scanner to avoid memory leaks
    }
}
