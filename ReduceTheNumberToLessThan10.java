import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();  // Input number
        int count = 0;

        while (N >= 10) {  // Repeat until N becomes a single-digit number
            count++;
            long product = 1;

            // Multiply all digits of N
            while (N > 0) {
                product *= N % 10;
                N /= 10;
            }

            N = product;  // Update N to the product of its digits
        }

        System.out.println(count);  // Output the persistence count
        sc.close();
    }
}

/*
The program must accept an integer N and print its multiplicative persistence, which is the number of times we must multiply the digits in N until we reach a single digit.

Boundary Condition(s): 1<= N <= 10^16

Input Format: The first line contains N.

Output Format:

The first line contains an integer value representing the multiplicative persistence.

Example Input/Output 1:

Input: 49

Output 3

Explanation:

1st time-4*936.

2nd time-3*6=18.

3rd time - 1*8 = 8.

So 3 is printed as the output.

Example Input/Output 2:

Input: 41

Output: 1
*/
