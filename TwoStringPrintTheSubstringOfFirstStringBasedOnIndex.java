import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two input strings
        String str1 = sc.next();
        String str2 = sc.next();

        sc.close();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find the minimum and maximum index positions in str1 of characters from str2
        for (char alpha : str2.toCharArray()) {
            int index = str1.indexOf(alpha);
            if (index != -1) {
                min = Math.min(index, min);
                max = Math.max(index, max);
            }
        }

        // Print the substring of str1 from min to max index (inclusive)
        if (min <= max) {
            System.out.println(str1.substring(min, max + 1));
        } else {
            System.out.println("No valid substring found.");
        }

        System.exit(0);
    }
}
/*
Example Input/Output 1:

Input:

corporate

oar

Output:
orpora

Explanation:

Here S1 corporate, S2 = oar.

The position of the first occurrence of o in the string S1 is 2.

The position of the first occurrence of a in the string S1 is 7.

The position of the first occurrence of r in the string S1 is 3.

The characters from the 2nd position (minimum position) to the 7th position (maximum position) in S1 are orpora.

Hence orpora is printed as the output.

Example Input/Output 2:

Input:

skillrack 

lak

Output:

killra
*/
