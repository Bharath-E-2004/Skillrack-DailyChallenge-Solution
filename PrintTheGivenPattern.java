import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        
        int r1 = 0, r2 = 1;

        for (int i = 1; i <= 2 * num - 1; i++) {
            if (i < num) {
                System.out.print("*".repeat(r1++) + i);
            } else if (i == num) {
                System.out.print("*".repeat(r2++) + (i + num - 1));
            } else {
                for (int j = 2 * num - i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*
 Example Input/Output 1:

Input:

3

Output:

1

*2

543

*6

**7

Explanation:

Here N = 3, so the pattern contains 5 lines ((2*3)-1).

1

*2

543

*6

**7
*/
