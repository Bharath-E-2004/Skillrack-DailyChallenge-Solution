import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read N
        int N = sc.nextInt();

        // Read N random numbers
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        // Read initial amount X
        int x = sc.nextInt();

        int originalX = x;
        boolean doubledAtLeastOnce = false;

        // Game logic
        for (int num : list) {
            if (num == x) {
                x = x * 2;
                doubledAtLeastOnce = true;
            }
        }

        // Output result
        if (doubledAtLeastOnce) {
            System.out.println(x);
        } else {
            System.out.println(0);
        }
    }
}

/*
In a game, there is a machine that generates a random number when a player presses a button. Initially, a player puts X rupees in the machine and starts the game. He can press the button N times. If he gets a random number equal to the amount in the machine, then the amount gets doubled. After pressing the button N times, he can collect the amount from the machine if the amount is doubled at least once. Otherwise, he will lose the amount. The program must accept N integers representing the N random numbers and the value of X as the input. The program must print the final amount the player gets as the output.

Boundary Condition(s):

1 <= N <= 100

1 Each random number, x <= 10 ^ 6

Input Format:

The first line contains N.

The second line contains N integers separated by a space representing the N random numbers.

The third line contains X.

Output Format:

The first line contains an integer representing the final amount the player gets.

Example Input/Output 1:

Input:

7 10 2 4 11 15 12 8 2

Output: 16

Explanation:

Here x = 2

1st random number: 10 1 = x so the amount is NOT doubled.

2nd random number: 2 = - x so the amount is doubled (X = 4).

3rd random number: 4== X, so the amount is doubled (X = 8).

4th random number: 11 I= X, so the amount is NOT doubled.

5th random number: 15 1= X, so the amount is NOT doubled.

6th random number: so the amount is NOT doubled. 121 = x

7th random number: 8 so the amount is doubled (X = 16)

After completing the game, the player gets 16 rupees.
*/
