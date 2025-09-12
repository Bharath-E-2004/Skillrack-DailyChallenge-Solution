import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        char[][] ch = new char[row][col];

        // Reading the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ch[i][j] = sc.next().charAt(0);
            }
        }

        // Searching for '(' and printing until ')'
        outerLoop:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (ch[i][j] == '(') {
                    j++;
                    while (true) {
                        if (j == col) {
                            j = 0;
                            i++;
                            if (i == row) break outerLoop;
                        }
                        if (ch[i % row][j] == ')') break outerLoop;
                        System.out.print(ch[i % row][j]);
                        j++;
                    }
                   sc.close();
                System.exit(0);
                }
            }
        }
    }
}

/*
The program must accept a character matrix of size R°C as the input. The matrix contains alphabets and a pair of parentheses. The program must print the characters present between the open parenthesis and the close parenthesis as the output. Consider the rows of the matrix in circular fashion (ie, top to bottom for rows where left to right in each row).

Boundary Condition(s): 2 <= R, C <= 50

Input Format:

The first line contains R and C separated by a space. The next R lines, each contains C characters separated by a space.

Output Format:

The first line contains the characters present between the open parenthesis and the close parenthesis.

Example Input/Output 1:

Input:

66

hfjbfd

Iqgtha

pi(ski

Track

)kfejh

Output skillrack
*/
