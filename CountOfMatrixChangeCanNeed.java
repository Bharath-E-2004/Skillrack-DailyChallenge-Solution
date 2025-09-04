import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                char val = sc.next().charAt(0);

                if (i % 2 == 0) {
                    if ((j % 2 == 0 && val == 'A') || (j % 2 != 0 && val == 'B')) {
                        count++;
                    }
                } else {
                    if ((j % 2 == 0 && val == 'C') || (j % 2 != 0 && val == 'D')) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}

/*
The program must accept a character matrix of size R°C containing only A, B, C and D as the input. The values of R and C are always even. The program must print the number of changes required in the matrix so that each 2*2 submatrix contains 4 alphabets A, B, C and D in the sorted order.

Boundary Condition(s):

2 <= R, C <= 50

Input Format:

The first line contains R and C separated by a space. The next R lines, each contains C characters separated by a space.

Output Format:

The first line contains an integer value representing the number of changes required in the matrix as per the given condition.

Example Input/Output 1:

Input

2 2

B B

C D

Output 

1

Explanation:

Only change required is in the position (1, 1) B -> A

So the matrix becomes

A B

C D

Example Input/Output 2:

Input:

6 4

CCCA

CBDB

CBAB

BDCD

DCAB

BADD

Output:

14
*/
