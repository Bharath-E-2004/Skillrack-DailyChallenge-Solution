import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Initialize and read the 2D array
        String[][] str = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                str[i][j] = sc.next();
            }
        }

        // Process 3x3 blocks
        for (int i = 0; i + 2 < row; i += 3) {
            for (int j = 0; j + 2 < col; j += 3) {
                for (int k = 0; k < 3; k++) {
                    // Repeat each element in the row of the block
                    if(k==1)
                       str[i + k][j + 1] = "*".repeat(str[i + k][j + 1].length());
                  else{
                    str[i + k][j]     = "*"repeat(str[i + k][j].length());
                    str[i + k][j + 2] = "*".repeat(str[i + k][j + 2].length());
                  }
                }
            }
        }

        // Print the final array
        for (String[] arr : str) {
            for (String a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
/*
The program must accept an integer matrix of size R°C and consider all possible non overlapping 3*3 sub matrices and print the values in the Diamond shape in them (as shown in Example Input/Output section. Other values are replaced with an asterisk for each digit.

Boundary Condition(s):

1 <= R, C <= 50

1<= Matrix element value <= 10^4

Input Format:

The first line contains R and C separated by a space.

The next R lines, each contains C integer values separated.

Example Input/Output 1:

Input:

57

10 11 12 13 14 15 16

20 21 22 23 24 25 26

30 31 32 33 34 35 36

41 42 45 48 47 44 49

63 66 65 64 61 62 69

Output:

1114

16

20** 22 23 25 26

*31*34* 36

41 42 45 48 47 44 49

63 66 65 64 61 62 69

Explanation:

Here R-5 and C-7.

In every 3*3 non-overlapping submatrices, after replacing all the values (except the values in diamond shape) with an asterisk for each digit, the matrix becomes

11 14 16

20 22 23 25 26

31 34 36

41 42 45 48 47 44 49

63 66 65 64 61 62 69

Example Input/Output

Input

67

10 11 12 13 14 15 16

20 21 22 23 24 25 26

30 31 32 33 34 35 36

41 42 45 48 47 44 49

63 66 65 64 61 62 69

91 92 93 94 95 96 99

Output:

*11**14*16

2022

23 25 26

*31*34*36

424749

63 65 64 62 69

*9295*99

Example Input/Output 3:

Input

78

39 38 56 5 77 73 54 34

6 30 21 28 218 84 52 47

28 15 3 25 25 80 78 52

26 23 67 100 73 66 59 12

7 37 18 11 8 19 89 38

69 44 38 52 92 316 82 30

33 73 59 72 56 67 16 29

Output:

**38

77 54 34

6** 21

28*** 84 52 47

*1525*78 52

* 23*73* 59 12

7 18 11 19 89 38

*44*92** 82 30

33 73 59 72 56 67 16 29
*/
