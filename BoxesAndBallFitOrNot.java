import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];

        // Read both arrays
        for (int i = 0; i < size; i++)
            arr1[i] = sc.nextInt();

        for (int i = 0; i < size; i++)
            arr2[i] = sc.nextInt();

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0;
        while (i < size && arr1[i] > arr2[i]) {
            i++;
        }

        System.out.println(i == size ? "YES" : "NO");

        sc.close();
    }
}
/*
There are M bowes and N balls on a table. Each box can hold a maximum of one ball only if the size of the ball is less than the size of the box. The size of each box and the size of each ball are passed as the input. The program must print YES if all N balls fit into N boxes. Else the program must print NO as the output.

Boundary Condition(s):

1<=N<=100

1 <= Size of each box and ball <= 10^5

Input Format:

The first line contains N.

The second fine contains N integers representing the size of the N boxes separated by a space. The third line contains N integers representing the size of the N balls separated by a space.

Output Format:

The first line contains YES or NO.

Example Input/Output 1:

Input:

5 
56987 
32178

Output: YES

Explanationc

One of the possible ways to keep the 5 balls in the 5 boxes is given below.

bax 5-ball 1 box 6-ball 2 box 9-ball bax 8-ball 7 box 7-ball3

Exampilo input/Output 2: Input: 5

56987
47276

*/
