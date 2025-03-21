public class Sum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};  // Array with 5 integers

        int i = 0;
        int sum = 0;  // Variable to store the sum

        while (i < numbers.length) {  // Loop through the array
            sum += numbers[i];  // Add the current element to sum
            
            i++;  // Increment the counter variable i by 1
        }
        
        // Print the total sum
        System.out.println("The sum of the array elements is: " + sum);
    }
}
