import java.util.Scanner;


public class FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = 0;
        while (true) {
            System.out.print("Enter the number of elements in the array: ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Array size must be a positive integer. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next(); // discard invalid token
            }
        }


        int[] array = new int[size];


        System.out.println("\nEnter " + size + " integer value(s), one at a time:");
        for (int i = 0; i < size; i++) {
            while (true) {
                System.out.print("Element [" + i + "]: ");
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    scanner.next();
                }
            }
        }


        int maxValue = array[0];
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }


        System.out.print("Array Elements   : [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Maximum Value    : " + maxValue);
        System.out.println("Index of Maximum : " + maxIndex);


        scanner.close();
    }
}