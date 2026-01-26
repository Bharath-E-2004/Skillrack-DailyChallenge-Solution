import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int N = sc.nextInt();

        // check all possible NxN submatrices
        for (int i = 0; i <= r - N; i++) {
            for (int j = 0; j <= c - N; j++) {

                int unit = mat[i][j] % 10;
                boolean found = true;

                for (int x = 0; x < N; x++) {
                    for (int y = 0; y < N; y++) {
                        if (mat[i + x][j + y] % 10 != unit) {
                            found = false;
                            break;
                        }
                    }
                    if (!found) break;
                }

                if (found) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }
}

/*
An integer matrix of size R°C is passed as the input. Another integer N is also passed as the input. The program must print Yes if there is a submatrix of size N°N where all the integers are having the same unit digit. Else the program must print No as the output.

Boundary Condition(s):

1 <= R C <= 100

1<= Matrix element value <= 1000 1<=N<=10

Input Format:

The first line contains R and C separated by a space.

The next R lines contain C values each separated by a space.

The R+2nd line contains N.

Output Format:

The first line contains Yes or No.

Example Input/Output 1:

Input:

56

122235

5448119

7 12 2 66 8 4

971 901 8 9 13

111325

2

Output:

Yes
*/
