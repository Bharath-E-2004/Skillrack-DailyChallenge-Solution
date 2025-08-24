import java.util.*;

public class Hello {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();

        int ind = 0;
        int open = 0, digit = 0;
        int maxDepth = 0, maxNum = 0;

        while (ind < str.length()) {
            char ch = str.charAt(ind);

            if (ch == '(') {
                if (digit != 0 && (open > maxDepth || (open == maxDepth && digit > maxNum))) {
                    maxNum = digit;
                    maxDepth = open;
                }
                digit = 0;
                open++;
            } else if (ch == ')') {
                if (digit != 0 && (open > maxDepth || (open == maxDepth && digit > maxNum))) {
                    maxNum = digit;
                    maxDepth = open;
                }
                digit = 0;
                open--;
            } else if (Character.isDigit(ch)) {
                digit = digit * 10 + (ch - '0');
              if(ind==str.length()-1 && max==0 digit>maxNum){
                maxNum=max;
              }
            }

            ind++;
        }

        System.out.println(maxNum);
    }
}
/*
The program must accept a string S as the input. The string S contains parentheses and integers, where each open parenthesis '(' has a matching close parenthesis ')'. The program must print the integer that occurs in the maximum depth of nested parentheses in S. If two or more integers occur in the same maximum depth, then the program must print the maximum value among those integers as the output.

Boundary Condition(s):

1<= Length of S <= 100

1<= Each integer value <= 10^5

Input Format:

The first line contains S.

Output Format:

The first line contains an integer representing the integer that occurs in the maximum depth of nested parentheses in S.

Example Input/Output 1:

Input 10((40)30)(50(60(70)))20((80))

Output 70

Explanation:

10-> depth = 0

40- depth2

30-> depth = 1

50-> depth=1

60-> depth = 2 70-> deptik-3

20- depth=0

80-> depth-2 The integer with the maximum depth is 70.

Hence 70 is printed as the output

25

26 27 28 29 30 31 4115

Code

*/
