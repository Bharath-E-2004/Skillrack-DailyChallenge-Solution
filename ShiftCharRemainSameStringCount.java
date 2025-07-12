import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input line and split into words
        String[] str = sc.nextLine().split(" ");

        // Read the number input
        int num = sc.nextInt();

        int count = 0;

        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            int len = s.length();

            if (len == num) {
                // Skip words with length exactly equal to num
                count++;
                continue;
            }

            if (len < num) {
                // Skip if word length is less than num
              count++;
                continue;
            }

            // Rotate word by 'num' characters
            String rotated = s.substring(len - num) + s.substring(0, len - num);

            // Check if rotated string is equal to original
            if (s.equals(rotated)) {
                count++;
            }

            // Replace word with rotated version
            str[i] = rotated;
        }

        // Print updated strings
        for (String s : str) {
            System.out.print(s + " ");
        }

        // Print final count
        System.out.println(count);
    }
}

/*
The program must accept a string 5 containing multiple words and an integer K as the input. For each word in the given string, the program must shift the characters to the right by K positions. The program must print the number of words that remain the same before and after the shift. Then the program also must print the revised string as the output.

Boundary Condition(s):

1<= Number of words in S <= 100 1 <= Length of each word, K <= 100

Input Format:

The first line contains S.

The second line contains K

Output Format:

The first line contains the number of words that remain the same before and after the shift.

The second line contains the revised string.

Example Input/Output 1:

Input

tiger Spider 5

Output

1 tiger piderS

Explanation:

After shifting the characters to the right by 5 positions in each word, the string becomes tiger pider5

Here only one word remains the same before and after the shift
*/
