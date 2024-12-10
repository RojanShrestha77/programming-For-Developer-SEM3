import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 1, 4
            , 5, 3, 4, 4, 5, 5, 5};

        // Use a HashMap to store the frequency of elements
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            // Increment the count for each element
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Display the frequency of each element
        System.out.println("Element frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
