import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        int[][] matrix = new int[row][col];
        List<Integer> oddList = new ArrayList<>();

        // Read values and separate odd numbers
        for (int i = 0; i < row * col; i++) {
            int val = sc.nextInt();
            if (val % 2 == 1) {
                oddList.add(val);
            } else {
                matrix[i / col][i % col] = val;
            }
        }

        // Sort odd numbers
        Collections.sort(oddList);
        int oddIndex = 0;

        // Fill matrix and print
        for (int[] arr : matrix) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0 && oddIndex < oddList.size()) {
                    System.out.print(oddList.get(oddIndex++) + " ");
                } else {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
/*
The program must accept an integer matrix of size R°C. Then the program must sort the odd integers in the matrix across all rows. Finally, the program must print the revised matrix.

Boundary Condition(s):

2 <= R, C <= 50

1<= Matrix element value <= 10^4

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integer values separated by a space.

Output Format:

The first R lines contain the revised matrix.

Example Input/Output 1:

Input:

34

90 5 85 29

53 9 17 88

16 99 41 21

Output:

90 5 9 17

21 29 41 88

16 53 85 99

Explanation:

Here R=3 and C=4.

The odd integers in the given 3*4 matrix are highlighted below.

90 5 85 29.

53 9 17 88

16 99 41 21

After sorting the odd integers in the given matrix, the matrix becomes

90 5 9 17

21 29 41 88

16 53 85 99
*/
