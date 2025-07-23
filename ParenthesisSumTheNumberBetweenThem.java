import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alpha = scanner.nextLine();

        long sum = 0;
        int open = 0;
        int i = 0;

        while (i < alpha.length()) {
            char current = alpha.charAt(i);

            if (Character.isDigit(current)) {
                int endIndex = alpha.indexOf(")", i);
                int startIndex = alpha.indexOf("(", i);

                // Prioritize finding the next closing parenthesis
                if (endIndex != -1 && (startIndex == -1 || endIndex < startIndex)) {
                    String numberStr = alpha.substring(i, endIndex);
                    sum += Integer.parseInt(numberStr);
                    i = endIndex + 1;
                    open--;
                } else {
                    // If no parentheses found, consume number until next symbol
                    int j = i;
                    while (j < alpha.length() && Character.isDigit(alpha.charAt(j))) {
                        j++;
                    }
                    sum += Integer.parseInt(alpha.substring(i, j));
                    i = j;
                }
            } else {
                if (current == '(') open++;
                else if (current == ')') open--;
                i++;
            }
        }

        System.out.println(sum);
    }
}
/*
Example Input/Output 1:

Input:

3

00111000

01001111

01000100

Output

00:03:23

Explanation:

1st lap: 00111000 -> 56 seconds.

2nd lap: 01001111 -> 79 seconds.

3rd lap: 01000100 -> 68 seconds.

So the total time is 203 seconds.

Hence the output is 00:03:23.

Example Input/Output 2:

Input:

6

01110001

10001100

10111100

11010100

10101001

10001100

Output:

00:16:02
*/
