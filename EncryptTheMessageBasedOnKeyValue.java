import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S1 = sc.next();   // message
        String S2 = sc.next();   // key (length 27)

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < S1.length(); i++) {

            char ch = S1.charAt(i);

            int pos = S2.indexOf(ch);  // 0-based index

            int matrix = pos / 9 + 1;
            int row = (pos % 9) / 3 + 1;
            int col = (pos % 3) + 1;

            result.append(matrix).append(row).append(col);
        }

        System.out.print(result.toString());
    }
}

/*
The program must accept two string values 51 and 52 as the input. The string S1 represents a message to be encrypted and it contains only lower case alphabets. The string S2 represents a key to be used to encrypt the message. The length of the string 52 is always 27 and it contains all 26 lower case alphabets and a dot(). The program must encrypt the string 51 and print the output based on the following conditions.

The program must form three 3*3 square matrices.

The program must fill the first square matrix with the first 9 characters of $2.

-The program must fill the second square matrix with the middle 9 characters of $2.

-The program must fill the third square matrix with the last 9 characters of 52

-For each character CH in the string S1, the program must print the square matrix number, the row number and the column number of the character CH.

Boundary Condition(s):

1 <= Length of 51 <= 100

Input Format:

The first fine contains S1.

The second line contains S2

Output Format:

The first line contains a string representing the encrypted message.

Example Input/Output 1:

Input:

skillrack

abcdefghijdm.nopqrstuvwnyz

Output:

312212133213213311111113212
*/
