import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        String[] str = new String[col];
        int[] arr = new int[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                String val = sc.next();
                if (Character.isDigit(val.charAt(0)) || (val.charAt(0) == '-' && val.length() > 1)) {
                    arr[j] += Integer.parseInt(val);
                } else {
                    str[j] += val;
                }
            }
        }

        for (int val : arr) {
            if (val > 0) System.out.print(val + " ");
        }

        for (String s : str) {
            if (s != null && s.length() > 4) {
                System.out.print(new StringBuilder(s.substring(4)).reverse() + " ");
            }
        }

        sc.close();
    }
}
/*
  Example Input/Output 1:

Input:

45

a 10 re 8

b 20 an 7

c30 co6

d 40 kn 50

Output:

100 71 dcba kcar none

Explanation:

Here R = 4, C5 and the matrix is given below.

a 10 re 8

b 20 an 7

c30 co 6

d 40 k n 50

1st column: Characters from bottom to top -> dcba

2nd column: Sum of integers -> 100

3rd column: Characters from bottom to top -> kcar

4th column: Characters from bottom to top -> none

5th column: Sum of integers -> 71

Hence the output is

100 71 dcba kcar none
*/
