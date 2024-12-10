import java.util.ArrayList;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5, -6, 7, -8, 9};

        int[] rearrangedArray = rearrange(array);

        System.out.println("Rearranged array:");
        for (int num : rearrangedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] rearrange(int[] array) {
        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> positives = new ArrayList<>();

        // Separate negative and positive numbers
        for (int num : array) {
            if (num < 0) {
                negatives.add(num);
            } else {
                positives.add(num);
            }
        }

        // Combine negatives and positives back into the array
        int index = 0;

        for (int num : negatives) {
            array[index++] = num;
        }

        for (int num : positives) {
            array[index++] = num;
        }

        return array;
    }
}
