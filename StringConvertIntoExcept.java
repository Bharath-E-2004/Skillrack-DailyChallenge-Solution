import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int remove = 0;
        int i = 0;

        while(i < s.length()) {

            // If last character remains alone
            if(i + 1 >= s.length()) {
                remove++;
                break;
            }

            // If adjacent characters are same
            if(s.charAt(i) == s.charAt(i + 1)) {
                remove++;
                i++;      // remove one character
            } 
            else {
                i += 2;   // valid pair
            }
        }

        System.out.println(remove);
    }
}

/*
The program must accept a string S as the input. The program must print the minimum number of characters to be removed from the string 5 so that the length of the revised string must be even(possibly 0) also every two consecutive characters(non-overlapping) must be different.

Boundary Condition(s): 2 <= Length of S <= 1000

Input Format:

The first line contains S.

Output Format:

The first line contains an integer value representing the minimum number of characters to be removed from S.

Example Input/Output 1:

Input: coffee

Output: 2

Explanation:

Here S= coffee.

The minimum number of characters to be removed from the string is 2.

coffee -> cofe

The length of the revised string is 4 which is even and every two consecutive characters are different.

Hence 2 is printed as the output.
*/
