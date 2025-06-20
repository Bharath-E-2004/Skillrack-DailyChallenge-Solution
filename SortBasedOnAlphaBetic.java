import java.util.*;

class Array {
    PriorityQueue<Integer> queue;
    int ind;

    public Array() {
        this.queue = new PriorityQueue<>();
        this.ind = 0;
    }

    public void add(int val) {
        queue.add(val);
        this.ind++;
    }

    public String toString() {
        StringJoiner join = new StringJoiner(" ");
        while (!queue.isEmpty()) {
            join.add(String.valueOf(queue.poll()));
        }
        return join.toString();
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array[] array = new Array[26];
        int size = sc.nextInt();

        for (int i = 0; i < 26; i++) {
            array[i] = new Array();
        }

        for (int i = 0; i < size; i++) {
            String value = sc.next();
            int total = 0;
            char c1 = '\0';

            for (char c : value.toCharArray()) {
                if (Character.isDigit(c)) {
                    int v1 = Character.getNumericValue(c);
                    total = total * 10 + v1;
                } else {
                    c1 = c;
                }
            }

            if (c1 >= 'a' && c1 <= 'z') {
                array[c1 - 'a'].add(total);
            }
        }

        for (Array arr : array) {
            if (arr.ind > 0) {
                System.out.print(arr + " ");
            }
        }
    }
}
/*
The program must accept N integers as the input. Each integer contains a lower case alphabet. The program must sort the integers based on the lower case alphabets. If two or more integers have the same alphabet, then the program must sort those integers in ascending order. Finally, the program must print the sorted integers as the output.

Boundary Condition(s):

1 <= N <= 1000

1 <= Each Integer value <= 10^5

Input Format:

The first line contains N.

The second line contains N integer values separated by a space.

Output Format:

The first line contains N integer values separated by a space.

Example Input/Output 1:

Input:

4 984b b14 20c0 662a

Output 662 14 984 200

Explanation:

Here N = 4.

The given 4 integers are 984b b14 20c0 662a.

After sorting the integer values based on the given conditions, the integers become 662 14 984 200.

Example Input/Output 2:

Input:

5 12e2 98e e354 2e5 89e1

Output:

25 98 122 354 891
*/
