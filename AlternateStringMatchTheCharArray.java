import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();

        // Check if both strings have equal even length
        if (str1.length() != str2.length() || str1.length() % 2 != 0) {
            System.out.println("NO");
            return;
        }

        boolean isMatch = true;

        for (int i = 0; i < str1.length(); i += 2) {
            if (str1.charAt(i) != str2.charAt(i + 1) str1.charAt(i+1)!=str2.charAt(i)) {
                isMatch = false;
                break;
            }
        }

        System.out.println(isMatch ? "YES" : "NO");
    }
}

/*
The program must accept two string values $1 and $2 having an equal even length as the input. The program must print "YES" if the alternate characters of S1 match the alternate characters of $2 ignoring the case. Else the program must print "NO" as the output.

Boundary Condition(s): 2 Length of S1, S2 <= 100

Input Format:

The first line contains $1. The second line contains $2.

Output Format:

The first line contains YES or NO.

Example Input/Output 1:

Input:

abcdef

parcte

Output: YES

Explanation:

The characters at the odd positions in $1= "ace". The characters at the even positions in S2 = "ace". Hence YES is printed as the output.

Example Input/Output 2:

Input:

abcdef

BQDSFU

Output: YES

Example Input/Output 3: Input: abcd abcd
*/
