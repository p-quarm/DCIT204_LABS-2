import java.util.Scanner;


public class PairSum {

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
                scanner.next();
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


        int target;
        while (true) {
            System.out.print("\nEnter the Target Sum: ");
            if (scanner.hasNextInt()) {
                target = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
            }
        }


        boolean found = false;
        int firstIndex = -1;
        int secondIndex = -1;

        outerLoop:
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    firstIndex = i;
                    secondIndex = j;
                    found = true;
                    break outerLoop;
                }
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
        System.out.println("Target Sum       : " + target);

        if (found) {
            int val1 = array[firstIndex];
            int val2 = array[secondIndex];
            System.out.println("Pair Found       : Yes");
            System.out.println("Indices          : " + firstIndex + " and " + secondIndex);
            System.out.println("Values           : " + val1 + " and " + val2);
            System.out.println("Equation         : " + val1 + " + " + val2 + " = " + target);
        } else {
            System.out.println("Pair Found       : No");
            System.out.println("No pair of elements in the array sums to the target value.");
        }


        scanner.close();
    }
}