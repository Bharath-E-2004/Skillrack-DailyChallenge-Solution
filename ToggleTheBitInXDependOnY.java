import java.util.

public class Hello {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in); int X=sc.nextInt(), Y=sc.nextInt();

System.out.println(((XY));

}

}
/*
Example Input/Output 1:

Input: 115

Output: 14

Explanation:

X = 11 -> 1011. Y=5-> 0101.

The 1st bit and 3rd bit from LSB are the set bits in Y. So the 1st bit and 3rd bit from LSB are toggled in X. X-> 1011 -> 1110 -> 14.

Example Input/Output 2:

Input: 615 218

Output: 701
*/
