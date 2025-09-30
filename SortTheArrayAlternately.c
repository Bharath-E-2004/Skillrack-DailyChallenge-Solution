public class Hello {

    // Function to sort alternate subarrays of size K
    static void sortAlternateSubarrays(int size, int arr[], int k) {
        for (int i = 0; i + k <= size; i += 2 * k) {
            // Sort the subarray arr[i ... i+k-1]
            for (int j = i; j < i + k; j++) {
                for (int m = j + 1; m < i + k; m++) {
                    if (arr[j] > arr[m]) {
                        // Swap without using temp variable
                        arr[j] = arr[j] + arr[m] - (arr[m] = arr[j]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 7, 2, 8, 1, 6, 3, 5, 4};
        int size = arr.length;
        int k = 3;

        sortAlternateSubarrays(size, arr, k);

        System.out.println("Array after sorting alternate subarrays of size " + k + ":");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
