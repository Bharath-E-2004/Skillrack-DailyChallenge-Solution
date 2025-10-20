import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            int val = sc.nextInt();
            int len = (val == 0) ? 1 : (int) Math.log10(Math.abs(val)) + 1;

            // Only create a new list if key doesn't exist
            map.putIfAbsent(len, new ArrayList<>());
            map.get(len).add(val);
        }

        int k = sc.nextInt(); // digit length
        int x = sc.nextInt(); // Xth smallest

        if (!map.containsKey(k) || map.get(k).size() < x) {
            System.out.println("-1");
        } else {
            List<Integer> ans = map.get(k);
            Collections.sort(ans);
            System.out.println(ans.get(x - 1));
        }
    }
}
/*
The program must accept a list of N unique integers and two integers K, Xas the input. The program must print the smallest integer among the K-digit integers in the given list. Ii there is no such integer, then the program must print-1 as the output.

Boundary Condition(s):

1N100

-10^9 <=Each integer value <= 10^9 1=K<=9 1-X-N

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

The third line contains K and X separated by a space.

Output Format

The first line contains an integer representing the Xth smallest integer among the K-digit integers in the given list ar-1.

Example Input/Output 1:

Input:

8 450 87 65 720 616 8 10 536

32

Output:

536

Explanation:

Here K = 3 and X = 2. The three-digit integers are 450, 720, 616 and 536. The 2nd smallest three-digit integer is 536. Hence 536 is printed as the output.

Example Input/Output

Input

6 -95-5254-13-20-654-40 23

Output

-20

Example Input/Output 3:

Input:

5 456 78 13-564 125

34

Output:

-1
*/
