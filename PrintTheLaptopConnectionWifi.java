import java.util.*;

public class Hello {
    public static void main(String[] args) {
        char[] array = new Scanner(System.in).nextLine().toCharArray();

        int wifiCount = 0;
        boolean laptop = false;
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'L') {
                count++;// Assuming '|' represents a laptop
                laptop = true;
            } else if (array[i] == '#') { // '#' marks the end of a connection
                if (laptop) {
                    System.out.print((wifiCount+" ").repeat(count);
                }
                count=0;
                laptop = false;
                wifiCount = 0;
            } else if (array[i] == '*') { // '*' represents a WiFi signal
                wifiCount++;
            }
        }

        // If the last character was part of a laptop connection
        if (laptop) {
            System.out.print((wifiCount+" ").repeat(count);
        }
    }
}
/*
Example Input/Output 2:

Input:

L-#-L-#-#-#--L

Output:

2 1 0
*/
