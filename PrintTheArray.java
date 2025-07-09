import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        int asc = 1, des = 1, eq1 = 1;

        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
            if (i > 0) {
                if (arr1[i] >= arr1[i - 1]) asc++;
                if (arr1[i] == arr1[i - 1]) eq1++;
                else des++;
            }
        }

        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        int eq2 = 1;
        int asc1=1;
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
            if (i > 0 && arr2[i] == arr2[i - 1]) eq2++;
            if(i>0 && arr2[i]>=arr2[i-1] ) asc1++;
        }

        if (eq1 == size1 && eq2 == size2) {
            // Both arrays are filled with equal values
            if (arr1[0] < arr2[0]) {
                printTheArray(arr1, arr2);
            } else {
                printTheArray(arr2, arr1);
            }
        } else if (asc == size1) {
          if(asc1==size2)
              printTheArray(arr2,arr1)
          else
            printTheArray(arr1, arr2);
        } else {
            printTheArray(arr2, arr1);
        }
    }

    public static void printTheArray(int[] a, int[] b) {
        for (int val : a) System.out.print(val + " ");
        System.out.println();
        for (int val : b) System.out.print(val + " ");
    }
}
/*
Two arrays with size M and N are passed as the input. One of the arrays is sorted in ascending order and the other array is sorted in descending order. The program must print the array sorted in ascending order and then the program must print the array sorted in descending order.

If in both arrays all the elements are equal

- then print the array with the smaller value first.

- if the values are also same then print the first array followed by the second array.

Boundary Condition(s):

2 <= M, N <= 100

1 <= Each integer value <= 10^5

Input Format:

The first line contains M.

The second line contains M integers separated by a space.

The third line contains N.

The fourth line contains N integers separated by a space.

Output Format:

The first two lines contain the integer values based on the given conditions.

Example Input/Output 1:

Input:

4

10 10 9 5

5

10 10 15 25 80

Output

10 10 15 25 80

10 10 9 5

Explanation:

The first array is sorted in descending order.

The second array is sorted in ascending order.

So the second array is printed first and then the first array is printed.
*/
