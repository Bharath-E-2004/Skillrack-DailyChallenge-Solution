import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long sum = 0;

        for(int i = 0; i < n; i++){
            sum += sc.nextLong();
        }

        long pendrive = 1;
        while(pendrive < sum){
            pendrive *= 2;
        }

        System.out.println(pendrive);
    }
}

/*

The program must accept N integers representing the sizes of N videos (in MB) as the input. A boy wants to store all the N videos in a single pendrive. The pendrives are available in sizes of 2^K (where K >= 0). The program must print the minimum size of pendrive (in MB) required to store all the N videos as the output.

Boundary Condition(s):

1 <= N <= 100

1 <= Size of each video(in MB) <= 10^6

Input Format:

The first line contains N.

The second line contains N integers separated by a space representing the sizes of the N videos (in MB).

Output Format

A

The first line contains an integer representing the minimum size of pendrive (in MB) required to

store all the N videos.

Example Input/Output 1:

Input

7

51 64 80 54 43 27 89

Output 512

Explanation:

Total size of the 7 videos 51+64+80+54+43+27+89-408.

Since the pendrives are available in powers of 2, the minimum size of the pendrive required is 512

Hence 512 is printed as the output.

*/
