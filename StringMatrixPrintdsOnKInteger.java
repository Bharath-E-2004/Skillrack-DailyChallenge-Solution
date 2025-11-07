import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();

        String str[] = new String[row];
        String alpha[][] = new String[row][col];

        // Read matrix rows
        for (int i = 0; i < row; i++) {
            str[i] = sc.nextLine().trim();
            alpha[i] = str[i].split(" ");
        }

        int k = sc.nextInt();
        boolean isNegative = (k < 0);
        k = Math.abs(k);

        if (isNegative) {
            // Vertical expansion
            for (int i = 0; i < row; i++) {
                for (int repeat = 0; repeat < k; repeat++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(alpha[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        } else {
            // Horizontal expansion
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print((alpha[i][j] + " ").repeat(k));
                }
                System.out.println();
            }
        }
    }
}

/*
The program must accept a character matrix of size R°C and an integer K as the input. The program must expand the matrix horizontally so that each character in the rows repeated K times if K is positive. Else the program must expand the matrix vertically so that each character in the columns repeated K times. Finally, the program must print the expanded matrix as the output.

Note: The value of K is always a nonzero value.

Boundary Condition(s):

1 < R, C <= 50

-50 <= K <= 50

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C characters separated by a space.

The R+2nd line contains K.

Output Format:

The lines contain the expanded matrix based on the given conditions.

Example Input/Output 1s

Input

33

abc

def

ghi

4

Output:

assabbbbcccc

ddddeeeeffff

999ghhhhilli
*/
