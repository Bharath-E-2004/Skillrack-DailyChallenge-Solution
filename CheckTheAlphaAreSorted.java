import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Character, Integer> map = new TreeMap<>();

        int val = sc.nextInt(); // Number of strings to read

        for (int i = 0; i < val; i++) {
            String str = sc.next();
            int len = str.length();

            // Extract last character and convert to lowercase
            char lastChar = Character.toLowerCase(str.charAt(len - 1));

            // Extract numeric part (everything except last character)
            int number = Integer.parseInt(str.substring(0, len - 1));

            map.put(lastChar, number);
        }

        int start = -1;
        for (Character alpha : map.keySet()) {
            if (start >= map.get(alpha)) {
                System.out.println("No");
                System.exit(0);
            }
            start = map.get(alpha);
        }

        System.out.println("Yes");
    }
}
/*
The program must accept N string values having an integer and an alphabet. Then the program must order the string values based on the alphabets in ascending order (ignoring the case). The program must print Yes if the corresponding integer values are strictly increasing. Else the program must print No as the output.

Note: The alphabets in the given N string values are always unique.

Boundary Condition(s):

1<= N <=26

Input Format:

The first line contains N.

The next N lines contain the string values.

Output Format:

The first line contains Yes or No.

Example Input/Output 1:

Input:

4 5B 2a

15x

11w

Output: Yes

Explanation:

Ordering the string values based on the alphabets(ignoring the case), the order is 2a 58 11w

15x.

Here the integer values are strictly increasing. Hence Yes is printed.
*/
