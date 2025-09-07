import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int len = str.length();

        int i = 0;
        while (i < len) {
            boolean isLower = isLowerCase(str.charAt(i));
            int j = i + 1;

            if (isLower) {
                while (j < len && isLowerCase(str.charAt(j))) {
                    j++;
                }
                if (j - i > 1) {
                    System.out.println(str.substring(i, j).toUpperCase());
                } else {
                    System.out.println(str.charAt(i));
                }
            } else {
                while (j < len && !isLowerCase(str.charAt(j))) {
                    j++;
                }
                if (j - i > 1) {
                    System.out.println(str.substring(i, j).toLowerCase());
                } else {
                    System.out.println(str.charAt(i));
                }
            }

            i = j;
        }
    }

    public static boolean isLowerCase(char alpha) {
        return alpha >= 'a' && alpha <= 'z';
    }
}

/*
The program must accept a string S as the Input. The program must toggle the case of the alphabets if two or more alphabets of the same case occur consecutively in the string 5. Then the program must print the revised string as the output.

Boundary Condition(s): 2 <= Length of S <= 1000

Input Format:

The first line contains S.

Output Format: The first line contains the revised string.

Example Input/Output 1: Input: breadANDjam

Output: BREADandJAM

Explanation:

Here S= breadANDjam. bread -> BREAD AND -> and jam -> JAM

Now the string becomes BREADandJAM.

Example Input/Output 2: Input SkillRack

Output: SKILLRACK

Example Input/Output 3: Input: aAbBcCdDee

Output: aAbBcCdDEE
*/
