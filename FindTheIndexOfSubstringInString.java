import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String main = sc.next(); // Main string

        String[] arr = new String[main.length()];
        int ind = 0;

        // Reading input strings until no more tokens
        while (true) {
            try {
                arr[ind++] = sc.next();
            } catch (Exception e) {
                break;
            }
        }

        int len = arr[0].length(); // Length of first substring

        // Printing position calculation
        for (int i = 0; i < ind - 1; i++) {
            System.out.println((main.indexOf(arr[i]) / len) + 1);
        }

        sc.close();
    }
}
/*
Example Input/Output 1:

Input:

skillrack

ack

ski

Output:

3 

1

2

Explanation:

Here S = "skillrack" and its substrings are given below.

ack -> 3rd substring of S.

ski -> 1st substring of S.

Mr -> 2nd substring of S.

Example Input/Output 2:

Input:

donkeymonkeykangaroo

ymonk

eykan

donke

garoo

Output:

2

3

1

4
*/
