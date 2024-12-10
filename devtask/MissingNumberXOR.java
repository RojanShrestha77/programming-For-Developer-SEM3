public class MissingNumberXOR {
    public static int findMissingNumber(int[] nums, int n) {
        int xorAll = 0;
        int xorArray = 0;

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        // XOR all numbers in the array
        for (int num : nums) {
            xorArray ^= num;
        }

        // XOR the two results to get the missing number
        return xorAll ^ xorArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6}; // Example array
        int n = 6; // Array should contain numbers from 1 to 6
        System.out.println("Missing number: " + findMissingNumber(nums, n));
    }
}
