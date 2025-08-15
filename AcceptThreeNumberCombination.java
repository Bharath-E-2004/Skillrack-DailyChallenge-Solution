import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> pq = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            pq.add(arr[i]); // individual elements

            if (i < 2) {
                pq.add(arr[i] + arr[i + 1]); // sum of adjacent pairs
            }

            sum += arr[i];
        }

        pq.add(sum); // total sum
        pq.add(arr[0] + arr[2]); // sum of first and last

        Collections.sort(pq);

        for (Integer val : pq) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
/*
The capacity of 3 vehicles are passed as the input. The program must print the number of passengers who can travel in such a way that the occupied vehicles are filled to their capacity. The output containing the number of passengers must be sorted.

Boundary Condition(s):

1<= Capacity of each vehicle <= 100

Input Format:

The first line contains the capacity of 3 vehicles separated by a space.

Output Format:

The first line contains the integer values representing the number of passengers.

Example Input/Output 1:

Input: 54 10

Output:

45 9 10 14 15 19

Explanation:

When just 1 car alone is used the filled capacity is 4 5 and 10.

When Car 1 and 2 are filled, the count of passengers is 9.

When Car 1 and 3 are filled, the count of passengers is 15.

Similarly, for Car 2 and 3 it is 14.

When all three cars are filled, the count is 19.

The output is these count of passengers sorted in ascending order.

Example Input/Output 2:

Input: 15 10 12

Output: 10 12 15 22 25 27 37
*/
