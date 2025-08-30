import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two integers M and N
        int M = sc.nextInt();
        int N = sc.nextInt();

        int original = 1;
        int second = 1;

        for (int i = 1; i <= M * N; i++) {
            int ans = second;

            // Example inner loop (can be customized)
            for (int j = 0; j < M * N; j++) {
                // Placeholder logic
            System.out.print((ans + j % M) + " "); // Assuming j is defined earlier

            if ((j+1) % M == 0) {
                 ans++;
            }
            }
            second += M;

            if (i % M == 0) {
                original += N;
                second = original;
            }
        }

        System.out.println();
        sc.close();
    }
}
/*
The program must accept two integers M and N as the input. The program must form a matrix of size (MN)x(MN). Then the program must fill the matrix with integers based on the following conditions.

- In the 1st MM submatrix, the program must fill the integers starting from 1.

- In the 2nd MM submatrix, the program must fill the integers starting from 2.

- In the 3rd MM submatrix, the program must fill the integers starting from 3.

- Similarly, the remaining submatrices are filled with integers.

Then the program must print the integer matrix as the output.

Boundary Condition(s):

2 <= M, N <= 10

Input Format:

The first line contains M and N separated by a space.

Output Format:

The first M'N lines, each contains M'N integer values separated by a space.

Example Input/Output 1:

Input:

3 2

Output

1 2 3 2 3 4

4 5 6 5 6 7

7 8 9 8 9 10

3 4 5 4 5 6

6 7 8 7 8 9

9 10 11 10 11 12

Explanation:

Here M3 and N = 2.

The 1st 3*3 submatrix is filled with the integers starting from 1.

1 2 3

4 5 6

7 8 9

The 2nd 3*3 submatrix is filled with the integers starting from 2.

2 3 4

5 6 7

8 9 10

The 3rd 3*3 submatrix is filled with the integers starting from 3.

3 4 5

6 7 8

9 10 11

The 4th 3*3 submatrix is filled with the integers starting from 4.

4 5 6

7 8 9

10 11 12

Example Input/Output 2:

Input:

2 4

Output:

1 2 2 3 3 4 4 5

3 4 4 5 5 6 6 7

5 6 6 7 7 8 8 9

7 8 8 9 9 10 10 11

9 10 10 11 11 12 12 13

11 12 12 13 13 14 14 15

13 14 14 15 15 16 16 17

15 16 16 17 17 18 18 19
*/
