import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (Character.isAlphabetic(ch)) {
                q.add(ch);
            } else {
                char digitChar = q.poll();
                int repeatCount = ch - '0';
                System.out.print(("1" + digitChar).repeat(repeatCount));
            }
        }

        System.exit(0);
    }
}
/*
The program must accept a string S as the input. The string contains pairs of groups of an equal number of alphabets and digits. The program must expand the string S by repeating each alphabet the corresponding digit times.

Boundary Condition(s): 2 <= Length of S <= 100

Input Format: The first line contains S.

Output Format: The first line contains the expanded string.

Example Input/Output 1: Input lion1234cat523

Output: liiooonnnncccccaattt

Explanation: Here S = "lion1234cat523". 1st group "lion1234": 1->1->1 1 -> 2 -> ii 0->3-> 000 n-> 4-> nonn

2nd group "cat523": c-> 5-> ccccc a->2-> aa t->3-> ttt

Example Input/Output 2: Input a2bc78xyz105

Output: aabbbbbbbcccccccoz
*/
