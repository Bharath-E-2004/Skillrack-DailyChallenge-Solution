import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int T = sc.nextInt();

        int index = 0;

        for (int t = 0; t < T; t++) {

            if (list.isEmpty()) {
                System.out.println(-1);
                return;
            }

            int val = list.get(index);
            int unit = Math.abs(val % 10);

            // remove unit digit
            val = val / 10;

            if (val == 0) {
                list.remove(index);

                if (!list.isEmpty()) {
                    index = index % list.size();
                }
            } else {
                list.set(index, val);

                // move index based on unit digit parity
                if (unit % 2 == 0) { // even → next
                    index = (index + 1) % list.size();
                } else { // odd → previous
                    index = (index - 1 + list.size()) % list.size();
                }
            }
        }

        if (list.isEmpty()) {
            System.out.println(-1);
            return;
        }

        long sum = 0;
        for (int x : list) sum += x;

        System.out.println(sum);
    }
}
/*
The program must accept a list of N integers and an integer T as the input. The program must remove T unit digits in the given list of integers based on the following conditions.

-The program must start removing the unit digits from the 1st integer.

- If the removed unit digit is even, then the program must remove the unit digit of the next integer. Else the program must remove the unit digit of the previous integer.

Similarly, the program must remove T unit digits in the given list of integers.

Once all the digits in an integer are removed, then the integer itself must be removed from the given list.

Consider the given list of integers in circular fashion when finding the previous and next Integers.

Finally, the program must print the sum S of the modified integers in the list as the output. If all integers are removed, then the program must print -1 as the output.

Boundary Condition(s):

2<= N <= 100

1< Each integer value <= 10^8 1<=T<=1000

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

The third line contains T.

Output Format:

The first line contains S or -1.

Example Input/Output 1:

Input:

4 87369 4012 22312 39845 6

Output 3903

Explanation:

Here N = 44 T = 6

t = 1 -> l 8736 4012 22312 39845 (The unit digit of the 1st integer is removed).

t = 2 -> 8 8736 4012 22312 3984 (The unit digit of the 4th integer is removed).

t = 3 -> 8736 4012 2231 3984 (The unit digit of the 3rd integer is removed).

t = 4 -> 8736 4012 2231 398 (The unit digit of the 4th integer is removed).

t = 5 ->873 44 2231 398 (The unit digit of the 1st integer is removed).

t = 6 -> 873 401 2231 398 (The unit digit of the 2nd integer is removed).

Now the sum of the modified integers is 3903 (873+ 401 + 2231 + 398). So 3903 is printed as the output.

Example Input/Output 2:

Input 4 22 44 33 55 7

Output 5

Explanation:

Here N = 44 t=2-24 33 55 t = 1 ->2 44 33 55 t = 7 -> 5 T = 7

t = 4 -> 2 * 3.55 (X indicates the integer to be removed) t = 3 -> 243.55

X 55 (X indicates the integer to be removed) t = 5 -> 2

t = 6 ->x 5 (X indicates the integer to be removed)

Hence 5 is printed as the output.

Example Input/Output 3: Input

3

123 456 789 9

Output -1
*/
