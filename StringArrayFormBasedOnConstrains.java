import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] str = new String[size];
        str[0] = sc.next();

        char c1 = str[0].charAt(0); // First character of the first string
        char c2 = str[0].charAt(str[0].length() - 1); // Last character of the first string

        for (int i = 1; i < size; i++) {
            str[i] = sc.next();
        }

        for (String s : str) {
            char firstChar = s.charAt(0);
            char lastChar = s.charAt(s.length() - 1);

            if (firstChar == c1 || lastChar == c1) {
                System.out.println(s);
            } else if (firstChar == c2 || lastChar == c2) {
                System.out.println(new StringBuilder(s).reverse());
            } else {
                System.out.println(s); // default case if no match
            }
        }
    }
}
/*
There are N string values that start with the same letter, but some string values are reversed. The program must accept those N string values and print the N string values that indicate the original string values as the output.

Notes

- There will be no string that starts and ends with the same letter.

- All string values do not end with the same letter.

- All string values contain only lower case alphabets.

Boundary Condition(s):

2 <= N <=50

2 <= Length of each string <= 100

Input Format:

The first line contains N.

The next N lines, each contains a string value.

Output Format:

The first N lines, each contains a string value.

Example Input/Output 1:

Input:

rabbit

5 rose

tekcor

egnar robbery

Output:

rabbit

rose rocket

range

robbery

Example Input/Output 2:

Input:

4

olleh

oah

hacked

dah

Output:

hello

hao

hacked

had
*/
