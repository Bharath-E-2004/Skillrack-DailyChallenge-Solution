import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Stack<Character> stk = new Stack<>();
        int ind = 0;

        System.out.print(str.charAt(ind));
        stk.push(str.charAt(ind++));

        for (; ind < str.length(); ind++) {
            if (stk.empty()) {
                System.out.println();
            }

            if (str.charAt(ind) == '(') {
                stk.push('(');
            } else {
                stk.pop();
            }
        }
    }
}
/*
  The program must accept a string S as the input. The string S contains only parentheses, where each open parenthesis (has a matching close parenthesis ')'. The program must split the string S into as many substrings as possible, where the parentheses in each substring must be balanced.

Boundary Condition(s):

2 Length of S <= 100

Input Format:

The first line contains S.

Output Format:

The lines contain the substrings of S based on the given conditions.

Example Input/Output 1:

Input: ()()

Output

()()

Explanation:

There are two balanced substrings in S.

Hence the output is

()

()

Example Input/Output 2:

Input:

0(0)0(0(0(010)

Output

((()))

((()))

(((()))
*/
