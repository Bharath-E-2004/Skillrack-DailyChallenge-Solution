import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");

        int len = array.length;

        // Stable sort using Bubble Sort
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {

                int v1 = extractNumber(array[i]);
                int v2 = extractNumber(array[j]);

                if (v1 > v2) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Print result
        for (String s : array) {
            System.out.print(s + " ");
        }
    }

    // Method to extract embedded integer
    public static int extractNumber(String str) {
        int val = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                val = val * 10 + (c - '0');
            }
        }
        return val;
    }
}

/*
The program must accept a string S containing multiple words as the input. Each word contains an integer value (i.e., An integer value is embedded in the word). The program must sort the words based on the embedded integer values. If two or more words have the same integer, then those words must be sorted in the order of their occurrence.

Boundary Condition(s): 2 <= Length of S <= 1000

Input Format: The first line contains S.

Output Format:

The first line contains the words separated by a space based on the given conditions.

Example Input/Output 1:

Input:

li55on t70iger 66goat h70en deer40

Output: deer40 li55on 66goat t70iger h70en

Explanation:

There are 5 words in the given string.

li55on

lion and 55

170iger tiger and 70 66goat goat and 66 h70en hen and 70 deer40 deer and 40 After sorting the words based on the embedded integer values, the words become deer40 li55on 66goat 170iger h70en

Example Input/Output 2:

Input:

key512board m512ouse wi510re monitor512 lapt512op

Output

wi510re key512board m512ouse monitor512 lapt5120p
*/
