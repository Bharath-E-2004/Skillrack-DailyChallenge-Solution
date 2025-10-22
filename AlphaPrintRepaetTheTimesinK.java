import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values X, Y, and K
        int x = sc.nextInt(); // Starting alphabet index
        int y = sc.nextInt(); // Ending alphabet index
        int k = sc.nextInt(); // Minimum required length

        // Calculate how many times each character must be repeated
        int rangeLength = y - x + 1;
        int times = (int) Math.ceil((double) k / rangeLength);

        // Build and print the stretched string
        StringBuilder result = new StringBuilder();
        for (int i = x - 1; i < y; i++) {
            char ch = (char) ('a' + i);
            result.append(String.valueOf(ch).repeat(times));
        }

        System.out.println(result.toString());
    }
}

/*
The program must accept three integers X, Y and K as the input. The program must form a string with lower case alphabets starting from the Xth alphabet to the Yth alphabet in the English alphabet set. The program must stretch the string as short as possible so that the string contains at least K characters. A stretch is to repeat each character in a string the same number of times. Then the program must print the resulting string as the output.

Boundary Condition(s): 1<=XY <= 26 1<= K <= 1000

Input Format:

The first line contains X, Y and K separated by a space.

Output Format:

The first line contains the resulting string.

Example Input/Output 1: Input 1513

Output:

aaabbbcccdddeee

Explanation:

Here X1,Y-5 and K - 13.

1st lower case alphabet is 'a'.

5th lower case alphabet is 'e'.

So the string is formed as "abcde".

Then the string is stretched as "aaabbbcccdddeee" whose length is 15 (13 <= 15).

Example Input/Output 2:

Input: 15 20

Output:

aaaabbbbccccddddeeee
*/
