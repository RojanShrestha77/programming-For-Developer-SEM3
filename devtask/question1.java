import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};

        if (array.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            // Check for the smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }

            // Check for the largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        // If secondSmallest or secondLargest are not updated, it means they don't exist
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No valid second smallest element.");
        } else {
            System.out.println("Second smallest element: " + secondSmallest);
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No valid second largest element.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
