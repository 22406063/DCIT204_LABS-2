import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get array size
        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            numbers[i] = input.nextInt();
        }

        // Get target sum
        System.out.print("Enter the target sum: ");
        int target = input.nextInt();

        boolean found = false;

        // Brute force pair search
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("\n===== RESULT =====");
                    System.out.println("Pair found!");
                    System.out.println("Index 1: " + i + " Value: " + numbers[i]);
                    System.out.println("Index 2: " + j + " Value: " + numbers[j]);
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo pair found that sums to " + target);
        }

        input.close();
    }
}
