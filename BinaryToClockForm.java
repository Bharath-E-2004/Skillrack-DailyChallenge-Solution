import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] column = new String[6];

        // Initialize columns
        for (int i = 0; i < 6; i++) {
            column[i] = "";
        }

        // Read 4 rows of 3 binary strings each
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                String val = sc.next(); // Each val is a 2-character binary string

                // Append bits to appropriate columns
                column[j * 2] += val.charAt(0);
                column[j * 2 + 1] += val.charAt(1);
            }
        }

        // Convert binary strings to decimal and print
        for (int i = 0; i < 6; i++) {
            column[i] = "" + Integer.parseInt(column[i], 2);
            System.out.print(column[i]);

            if (i % 2 == 1 && i != 5) {
                System.out.print(":");
            }
        }
    }
}
/*
The petogen must accept a matrix of size 4*8 representing a binary clock. The binary clock format is oven below

The hash symbols (#) will be having a 0 or 1.

*/
