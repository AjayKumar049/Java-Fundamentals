// Taking user input and checking if the number is even or odd
import java.util.Scanner;

class EvenOddChecker { 
    public static void main(String[] args) {

        // Creating Scanner class object
        Scanner scn = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter any number: ");
        int num = scn.nextInt();
        
        // Checking even or odd
        if (num % 2 == 0) {
            System.out.println("The number you entered is even: " + num);
        } else {
            System.out.println("The number you entered is odd: " + num);
        }

        // Closing the scanner to release resources
        scn.close();
    }
}

