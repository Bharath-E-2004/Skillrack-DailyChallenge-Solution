import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long result = 0;

        for (int i = 0; i < size; i++) {
            String val = sc.next();
            StringBuilder sb = new StringBuilder();

            // Check for missing digits from 0 to 9
            for (int digit = 0; digit <= 9; digit++) {
                if (!val.contains(String.valueOf(digit))) {
                    sb.append(digit);
                }
            }
              result += Long.parseLong(sb.toString());
        }
            System.out.println("Cumulative sum: " + result);
        
        sc.close();
    }
}

/*
The program must accept N integers as the input. For each integer X among the given Ni integers, the program must form an integer using the missing digits in X in descending arder Then the program must print the sum of the N resulting integers as the output.

Boundary Condition(s):

1<= N <= 100

1<= Each integer value <= 10^8

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

Output Format:

The first line contains an integer representing the sum obtained based on the given conditions.

Example Input/Output 1:

Input:

4 4647 67865 150 321879

Output: 20679392

Explanation:

1st integer 4647-> 9853210.

2nd integer 67865-> 943210

3rd integer 150 -> 9876432

4th integer 321879-> 6540.

9853210 943210 98764326540-20679392

Example input/Output 2:

Input 6

16091486 66905731 21139621 94271012 30503791 51552070

Outeut 211852
*/
