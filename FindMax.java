import java.util.Scanner;

public class FindMax {
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

        // Find maximum value and index
        int max = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        // Display result
        System.out.println("\n===== RESULT =====");
        System.out.println("Maximum Value: " + max);
        System.out.println("Index of Maximum Value: " + maxIndex);

        input.close();
    }
}
