import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int currLen = 0, minLen = N;
        int sum = 0, minSum = 0;
        boolean above100 = false;

        for (int i = 0; i < N; i++) {
            int score = sc.nextInt();

            if (score >= 100) {
                if (above100) {
                    sum += score;
                    currLen++;
                } else {
                    sum = score;
                    currLen = 1;
                    above100 = true;
                }
            } else {
                if (above100) {
                    if (currLen <= minLen) {
                        minLen = currLen;
                        minSum = sum;
                    }
                    above100 = false;
                    currLen = 0;
                    sum = 0;
                }
            }
        }

        // Final check in case the last scores were >= 100
        if (above100 && currLen <= minLen) {
            minLen = currLen;
            minSum = sum;
        }

        if (minLen > 0) {
            System.out.printf("%.2f", (float) minSum / minLen);
        } else {
            System.out.println("No valid sequence found.");
        }
    }
}
/*
The program must accept N integers representing the runs scored by a batsman in N matches. The program must find the shortest sequence of 100+ scores(consecutive 100+ scores) by the batsman. If two or more sequences of 100+ scores are of the same shortest length, then the program must consider the last sequence. Finally, the program must print the average score of the batsman in that shortest sequence as the output. The average score must be printed with the precision up to 2 decimal places.

Note: There will be at least one 100+ score in N matches.

Boundary Condition(s):

1 <= N <= 1000

1 <= Each integer value <= 500

Input Format:

The first line contains N.

The second line contains N integer values separated by a space representing the runs scored by the batsman in N matches.

Output Format:

The first line contains the average score of the batsman in that shortest sequence of 100+ scores.

Example Input/Output 1:

Input:

14 47 74 190 157 80 114 192 115 196 110 20 186 146

Output:

166.00

Explanation:

1st sequence of 100+ scores: 190 157

2nd sequence of 100+ scores: 114 192 115 196 110

3rd sequence of 100+ scores: 186 146

There are two shortest sequences of 100+ scores: 1st and 3rd

The average score in the 3rd sequence(last shortest) is 166.00, which is printed as the output.
*/
