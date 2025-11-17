import java.util.*;

class Para implements Comparable<Para> {
    String paren;
    int nesting;
    int order;   // to keep original occurrence order

    public Para(String s, int order) {
        this.paren = s;
        this.order = order;

        int open = 0;
        int maxDepth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
                maxDepth = Math.max(maxDepth, open);
            } else if (c == ')') {
                open--;
            }
        }
        this.nesting = maxDepth;
    }

    @Override
    public int compareTo(Para o) {
        if (this.nesting != o.nesting)
            return this.nesting - o.nesting;   // sort by nesting
        return this.order - o.order;          // preserve original order
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().trim();

        List<Para> list = new ArrayList<>();

        int open = 0, close = 0;
        int start = 0;
        int orderCounter = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') open++;
            else if (S.charAt(i) == ')') close++;

            if (open == close) {  // balanced substring found
                String sub = S.substring(start, i + 1);
                list.add(new Para(sub, orderCounter++));
                start = i + 1;
                open = close = 0;
            }
        }

        Collections.sort(list);

        for (Para p : list) {
            System.out.print(p.paren + " ");
        }
    }
}
/*
The program must accept a string S as the input. The string S contains only parentheses, where each open parenthesis '(' has a matching close parenthesis ')'. The program must split the string S into as many substrings as possible, where the parentheses in each substring must be balanced. Then the program must sort the balanced substrings based on their nesting level. If two or more balanced substrings have the same nesting level, then the program must sort those balanced substrings in the order of their occurrence. Finally, the program must print the sorted balanced substrings as the output.

Boundary Condition(s):

2 Length of S <= 100

Input Format:

The first line contains S.

Output Format:

The first line contains the sorted balanced substrings separated by a space.

Example Input/Output 1:

Input:

((00)0)0((((((0)))(0) (0))(000000)

Output:

0 (000000) ((0) (0) (0) ((0)) ((((())))))

Explanation:

There are 5 balanced substrings in the given string S.

((0)((0)(0) -> Nesting Level 3

0-> Nesting Level 1

(((((0)))(0) -> Nesting Level 5

(((0)) -> Nesting Level 3

(000000) -> Nesting Level 2

After sorting the balanced substrings based on their nesting level, the substrings become
*/
