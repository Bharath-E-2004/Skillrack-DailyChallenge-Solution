import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();

        int count = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 == ch2) {
                count += 2; // Same character at same position
            } else {
                // Check and update for str1 character
                if (map.containsKey(ch1)) {
                    count++;
                    map.remove(ch1);
                } else {
                    map.put(ch1, 1);
                }

                // Check and update for str2 character
                if (map.containsKey(ch2)) {
                    count++;
                    map.remove(ch2);
                } else {
                    map.put(ch2, 1);
                }
            }
        }

        System.out.println(count);
    }
}
/*
  The program must accept two string values $1 and 52 representing the names of two persons as the input. The program must calculate the name matching score based on the following conditions.

-If a character occurs in the same position in both names, then the score increments by 2.

If a character occurs in both names but in different positions, then the score increments by 1.

Once a character in a position is used for the calculation, it cannot be considered again.

However, if the same character occurs in another position, then it can be used.

Finally, the program must print the name matching score for the given two persons as the output.

Boundary Condition(s):

1 Length of $1, $2 <= 1000

Input Format:

The first line contains $1.

The second line contains 52.

Output Format:

The first line contains an integer representing the name matching score for the given two persons.

Example Input/Output 1:

Input:

bhuvana lavanya

Output: 5

Explanation:

There is only one character that occurs in the same position in both names and it is highlighted

below.

bhuvana

lavanya

The characters v, a and n occur in both names but in different positions.

So the total score is 2+1+1+1-5.
*/
