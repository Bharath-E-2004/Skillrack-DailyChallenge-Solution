import java.util.*;

public class Hello {
    public static void main(String[] args) {
        String[] time = new Scanner(System.in).nextLine().split(" ");

        // Parse start time (T1)
        int hh1 = Integer.parseInt(time[0].split(":")[0]);
        int mm1 = Integer.parseInt(time[0].split(":")[1]);

        // Parse end time (T2)
        int hh2 = Integer.parseInt(time[1].split(":")[0]);
        int mm2 = Integer.parseInt(time[1].split(":")[1]);

        // Round mm1 up to the next 15-minute mark
        mm1 = ((mm1 / 15) + (mm1 % 15 == 0 ? 0 : 1)) * 15;
        if (mm1 == 60) {
            hh1++;
            mm1 = 0;
        }

        int count = 0;

        while (true) {
            // If current time exceeds end time, break
            if (hh1 > hh2 || (hh1 == hh2 && mm1 > mm2)) {
                System.out.println(count);
                break;
            }

            count++;

            // Move to next 15-minute slot
            mm1 += 15;
            if (mm1 == 60) {
                hh1++;
                mm1 = 0;
            }

            // Handle wrap-around for midnight (00:00)
            hh1 %= 24;
        }
    }
}
/*
In an online game, a 15-minute round starts in each quarter-hour period 
(00:00-00:15, 00:15 -00:30, 00:30 - 00:45, 00:45 - 01:00, ... 23:15 - 23:30, 23:30 - 23:45, 23:45-00:00, ... and so on). 
Hector wants to play the game from T1 to T2 (in 24-hr format). The starting time T1 and the ending time T2 are passed as the input.
The program must print the maximum number of times Hector can play the game completely as the output.

Input Format: The first line contains the starting time T1 and the ending time T2 (in 24-hr format). Output Format: 
The first line contains the maximum number of times Hector can play the game. Example Input/Output 1: 
Input: 10:18 11:13

Output: 2 Explanation: Hector can play the game completely twice and the two slots are given below. 10:30 to 10:45 10:45 to 11:00 Example Input/Output 2: Input: 15:00 17:59
*/
