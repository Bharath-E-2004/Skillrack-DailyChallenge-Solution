import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();         // Input string
        char ch = sc.next().charAt(0);  // Alignment character ('u' or 'l')
        int len = sc.nextInt();         // Length for substring

        String sub1 = str.substring(0, len); // First substring
        String sub2 = new StringBuilder(str.substring(str.length() - len)).reverse().toString(); // Reversed substring

        int maxLen = Math.max(sub1.length(), sub2.length());

        if (ch == 'u') {
            // Upper alignment: pad sub2
            System.out.println("*".repeat(maxLen - sub2.length()) + sub2);
            System.out.println("*".repeat(maxLen - sub1.length()) + sub1);
        } else {
            // Lower alignment: pad sub1
            System.out.println(" ".repeat(maxLen - sub1.length()) + sub1);
            System.out.println(" ".repeat(maxLen - sub2.length()) + sub2);
        }

        System.exit(0);
    }
}
/*
Example Input/Output 1:

Input:

SkillRack

U6

Output

*kcaR

Skill

Explanation:

Here S = "SkillRack", CH = 'U' and X = 6.

So the string S is folded up from the 6th character.

Hence the output is

*kcaR

Skill

Example Input/Output 2:

Input

SkillRack

d3

Output

****Sk

kcaRlli

Example Input/Output 3:

Input

notebook

u5

Output

koob

note
*/
