import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");

        int maxLength = 0;
        for (String str : arr) {
            maxLength = Math.max(maxLength, str.length());
        }

        for (int j = 0; j < maxLength; j++) {
            for (int i = 0; i < arr.length; i++) {
                if(i%2==0)
                   System.out.print(Arr[i].length()>j?Arr[i].charAt(j):'*');
                else
                   System.out.print(maxLength-Arr[i].length()<=j?Arr[i].charAt(j-(maxLength-Arr[i].length())):'*');
            }
            System.out.println();
        }

        scanner.close();
    }
}
/*
The program must accept a string 5 containing multiple words as the input. The program must print the words based on the following conditions.

The number of lines to be printed is equal to the length of the longest word among the given words.

- The words in the given string S must be printed vertically in the order of their occurrence.

The words that occur in the odd positions must be aligned on the top side.

The words that occur in the even positions must be aligned on the bottom side.

- The empty spaces above/below each string must be printed as asterisks.

Boundary Condition(s): 3<= Length of S <= 1000

Input Format:

The first line contains S.

Output Format:

The lines containing the string values based on the given conditions.

Example Input/Output 1:

Input

bricks stones vegetables fruits grains

Output:

b*v*g

iga

kstfn

r'e'r cei "eet SSS

stars

*obu

*nli

Explanation:

Here the given string contains 5 words.

The length of the longest word is 10. So the number of lines to be printed is 10.

The words bricks, vegetables and grains are aligned on the top side.

The words stones and fruits are aligned on the bottom side.
*/
