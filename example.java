import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for group of numbers
        System.out.print("Enter a group of numbers separated by spaces: ");
        String numbersInput = scanner.nextLine();

        // Taking input for index of the last number to print
        System.out.print("Enter the index of the last number to print (starting from 1): ");
        int endIndex = scanner.nextInt();

        // Parsing the input string to extract numbers
        String[] numbersArray = numbersInput.split("\\s+");

        // Printing all the numbers from the beginning up to the specified index
        if (endIndex > 0 && endIndex <= numbersArray.length) {
            System.out.println("Numbers till index " + endIndex + ": ");
            for (int i = 0; i < endIndex; i++) {
                System.out.print(numbersArray[i] + " ");
            }
            System.out.println(); // Move to the next line after printing all numbers
        } else {
            System.out.println("Invalid index.");
        }

        scanner.close();
    }
}
