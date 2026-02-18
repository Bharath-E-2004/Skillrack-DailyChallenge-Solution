import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Map<Long, Integer> map = new LinkedHashMap<>();
        int maxSeconds = 0;

        for(int i = 0; i < size; i++) {

            long number = sc.nextLong();
            String sTime = sc.next();
            String eTime = sc.next();

            int totalSeconds = diff(sTime, eTime);

            map.put(number, map.getOrDefault(number, 0) + totalSeconds);

            maxSeconds = Math.max(maxSeconds, map.get(number));
        }

        for(Long number : map.keySet()) {
            if(map.get(number) == maxSeconds) {
                System.out.println(number);
            }
        }
    }

    public static int diff(String sTime, String eTime) {

        String[] T1 = sTime.split(":");
        String[] T2 = eTime.split(":");

        int h1 = Integer.parseInt(T1[0]);
        int m1 = Integer.parseInt(T1[1]);
        int s1 = Integer.parseInt(T1[2]);

        int h2 = Integer.parseInt(T2[0]);
        int m2 = Integer.parseInt(T2[1]);
        int s2 = Integer.parseInt(T2[2]);

        int start = h1 * 3600 + m1 * 60 + s1;
        int end = h2 * 3600 + m2 * 60 + s2;

        return end - start;
    }
}
/*
The program must accept the outgoing call logs of a mobile number as the input. Each call log contains the mobile number, call start time and end time. The program must print the mobile number having the maximum call duration. If there are two or more such mobile numbers having the maximum call duration, then the program must print them in the order of their occurrence.

Boundary Condition(s):

2 <= N <= 50

Input Format:

The first line contains N.

The next N lines, each contains the mobile number, call start time and end time separated by a space.

Output Format:

The lines contain the mobile number(s) having the maximum call duration.

Example Input/Output 1:

Input:

5

9876543210 07:08:00 07:09:32

9998887775 10:50:00 10:50:10

9876543210 10:50:45 10:55:00

9998887775 13:23:10 13:24:58

9998887775 17:05:27 17:06:40

Output:

9876543210

Explanation:

9876543210 (2 times) -> Total duration: 92+255-347 seconds.

9998887775 (3 times) -> Total duration: 10+108 73 191 seconds.

The mobile number 9876543210 is having the maximum call duration,

Hence the output is 9876543210.
*/
