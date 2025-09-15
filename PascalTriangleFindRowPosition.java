import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        long[] array = new long[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextLong();
        }

        List<Long> list = new ArrayList<>();
        list.add(1L);

        int row = 1;
        while (true) {
            List<Long> newList = new ArrayList<>();
            newList.add(1L);

            for (int j = 1; j < list.size(); j++) {
                newList.add(list.get(j - 1) + list.get(j));
                if(j<size && array[j]==newList.get(j)) row++;
            }

            newList.add(1L);

            // Check if newList matches the input array
            boolean match = true;
            if (row == size) {
              for(Integer val:newList){
                   System.out.print(val+" ");
              }  
            }

            list = newList;
            row++;
        }
    }
}
/*
The program must accept N integers representing an incomplete row of Pascal's triangle as the input. Pascal's triangle is a triangular array constructed by summing adjacent integers in preceding rows. The program must complete the row by finding the missing integers in the row. Then the program must print the complete row of Pascal's triangle as the output.

Boundary Condition(s):

2 <= N <= 30

Input Format:

The first line contains N.

The second line contains N integers separated by a space.

Output Format:

The first line contains the integer values representing the complete row of Pascal's triangle.

Example Input/Output 1:

Input

4

16 15 20

Output

16 15 20 15 61

Explanation:

The given 4 integers represent the 7th row of Pascal's triangle.

The first 7 rows of Pascal's triangle are given below.


Code

1331

14641

15 10 10 5 1

16 15 20 15 61

The missing integers in the 7th row are 15, 6 and 1.

Hence the complete 7th row is printed as the output.

16 15 20 15 6 1

Example Input/Output 2:

Input:

2

13

Output: 1331

Explanation:

The given 2 integers represent the 4th row of Pascal's triangle. Hence the complete 4th row is printed as the output.

1331
*/
