import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split(" ");
        int n=str.length;
        for (int i = 0; i < str.length; i++) {
            while (i<n && str[i].startsWith("[")) {
                while (!str[i].endsWith("]") && i < str.length - 1) {
                    i++;
                }
                i++;
            }
            if(i>=n) break;
            for (int j = i + 1; j < str.length; j++) {
                while (j<n && str[j].startsWith("[")) {
                    while (!str[j].endsWith("]") && j < str.length - 1) {
                        j++;
                    }
                    j++;
                }
              if(j>=n) break;
                int val1 = Integer.parseInt(str[i]);
                int val2 = Integer.parseInt(str[j]);

                if (val1 >= val2) {
                    // Swap values
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        for (String temp : str) {
            System.out.print(temp + " ");
        }

        sc.close();
    }
}
/*
Input Format:

The first line contains a list of integers separated by a space, where some groups of integers

are enclosed within a pair square brackets.

Output Format:

The first line contains the revised list of integers based on the given conditions

Example Input/Output 1:

Input

40 20 [50 10 60] 30 [9 8 7 5 1] 15 65 25

Output

15 20 (50 10 60] 25 [9 8 7 5 11 30 40 65

Explanation:

The integers that occur outside the square brackets are given below. 40 20 30 15 65 25

After sorting those integers in their positions, the list becomes

15 20 [50 10 60] 25 [9 8 7 5 1] 30

40 65

Example Input/Output 2:

Input:

[98765432 [1]

Output:

[9876] 2345 [1]

Example Input/Output 3:

Input:

123 9875 110 50 20 30 401 8 9

Output:

89 [10 50 20 30 40] 123 9875
*/
