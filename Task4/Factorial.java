package Task4;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) { 
        // Creating Scanner object
        Scanner scn = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter any number: ");
        int num = scn.nextInt(); // Taking user input
        
        int i, fact = 1;  // Initialize fact as 1
       
        for (i = 1; i <= num; i++) {    
            fact = fact * i;  // Multiply fact by i
        }    

        System.out.println("Factorial of " + num + " is: " + fact);    
        
        scn.close(); // Close scanner
    }
}

