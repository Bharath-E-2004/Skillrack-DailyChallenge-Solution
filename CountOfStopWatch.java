import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();  // Fixed typo: used '=' instead of '-'
        int arr[] = new int[num];
        
        // If num is odd, output -1 and exit
        if (num % 2 == 1) {
            System.out.println(-1);
            System.exit(0);
        }

        int total = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 1) {
                total += (arr[i] - arr[i - 1]); // Sum differences at every even-odd pair
            }
        }

        System.out.println(total);
        sc.close();
    }
}
/*
Example Input/Output 1:

Input

2

8 12

Output:

4

Explanation:

Here N=2 and the given two integers are 8 and 12.

The stopwatch was turned on at the time 8 and turned off at the time 12.

So the time displayed on the stopwatch after pressing the button 2 times is 4 (12-8).

Example Input/Output 2:

Input:

5

3 6 10 11 18

Output:

-1

Example Input/Output 3:

Input:

4 03 74 87

Output 16
*/
