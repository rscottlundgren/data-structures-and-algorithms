import java.util.Arrays;

public class Solution {

    public static boolean canMakeArithmeticProgression(int[] arr) {

        // Sort the provided array
        Arrays.sort(arr);

        // Method State
        int diff = arr[1] - arr[0];
        boolean hasArithmeticProgression = true;

        // Looping through the now sorted array...
        for (int i = 1; i < arr.length - 1; i++) {

            // If there is a confirmed arithmetic progression so far AND the
            // difference between the next element and the present element
            // DOES NOT EQUAL 'diff'...
            if (hasArithmeticProgression && arr[i + 1] - arr[i] != diff) {

                // Set `hasArithmeticProgression` to false
                hasArithmeticProgression = false;
            }
        }

        // Return the boolean value in `hasArithmeticProgression`
        return hasArithmeticProgression;
    }

    public static void main(String[] args) {
        // Instantiate a test case
        int[] arr = { 7, 6, 5, 4, 3, 2, 1 };

        // Run the
        canMakeArithmeticProgression(arr);

        System.out.printf("Input:\t%s\n", Arrays.toString(arr));
        System.out.printf("Output:\t%s\n", canMakeArithmeticProgression(arr));
    }
}
