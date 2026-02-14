import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        char[][] matrix = new char[R][C];

        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }

        int K = sc.nextInt();

        List<String> compareList = new ArrayList<>();
        List<String> printList = new ArrayList<>();

        // Extract KxK submatrices
        for(int i = 0; i < R; i += K) {
            for(int j = 0; j < C; j += K) {

                StringBuilder compare = new StringBuilder();
                StringBuilder formatted = new StringBuilder();

                for(int x = 0; x < K; x++) {
                    for(int y = 0; y < K; y++) {
                        compare.append(matrix[i + x][j + y]);
                        formatted.append(matrix[i + x][j + y]).append(" ");
                    }
                    formatted.append("\n");
                }

                compareList.add(compare.toString());
                printList.add(formatted.toString());
            }
        }

        // Find first non-repeated block
        for(int i = 0; i < compareList.size(); i++) {

            boolean unique = true;

            for(int j = 0; j < compareList.size(); j++) {
                if(i != j && compareList.get(i).equals(compareList.get(j))) {
                    unique = false;
                    break;
                }
            }

            if(unique) {
                System.out.print(printList.get(i));
                return;
            }
        }

        System.out.println("-1");
        sc.close();
    }
}

/*
The program must accept a character matrix of size R°C and an integer K as the input. The values of R and Care always divisible by K. The program must print the first non-repeated K°K submatrix in the given matrix as the output. If there is no such submatrix, then the program must print -1 as the output.

Boundary Condition(a): 4 <= R, C<= 50 2=K<= 25

Input Format:

The first line contains Rand C separated by a space.

The next R lines, each contains C characters separated by a space.

The R+2nd line contains K.

Output Format:

The first K lines contain the first non-repeated K°K submatrix in the given matrix or the first line

contains-1.

Example Input/Output 1:

Input:

69 abcimnabc defpqrdef ghixzyghi cbacbanmi fedfedrqp ihgihgyzx 3

Output

Imn pqr xzy
*/
