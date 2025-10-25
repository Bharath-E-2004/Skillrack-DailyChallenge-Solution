import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        List<String> list = new ArrayList<>();
        String lastInt = null;
        int ind = 0;

        for (int i = 0; i < row * col; i++) {
            String str = sc.next();

            if (str.length() == 1 && Character.isDigit(str.charAt(0))) {
                if (lastInt != null) {
                    list.add(list.indexOf(lastInt) + 1, str);
                } else {
                    list.add(ind + 1, str);
                }
            } else {
                try {
                    int val = Integer.parseInt(str);
                    if (str.charAt(0) == '0') {
                        // Leading zero case, treat as string
                        list.add(str);
                        if (lastInt != null) {
                            list.add(list.indexOf(lastInt) + 1, str);
                        }
                    } else {
                        list.add(str);
                        if (lastInt != null) {
                            list.add(list.indexOf(lastInt) + 1, str);
                        }
                    }
                    lastInt = str;
                } catch (Exception e) {
                    list.add(ind, str);
                    ind++;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(list.get(i * col + j) + " ");
            }
            System.out.println();
        }

        System.exit(0);
    }
}
/*
Example Input/Output 1:

Input

45 12.74 K rock t 9 stone a b c sun moon 7 h8 hi3hi p 900 ab 250

Output:

Ktabc

hp 12 74 9

7 8 900 250 rock

stone sun moon hi3hi ab

Explanation:

In the given 4*5 matrix, there are 7 characters, 7 integers and 6 words.

7 characters -> Ktabchp

7 integers-> 12 74 9 7 8 900 250

6 words -> rock stone sun moon hihi ab

After modifying the matrix based on the given conditions, the matrix becomes

Ktabc hp 12 74 9

7 8 900 250 rock

stone sun moon hi3hi ab

Example Input/Output 2:

Input:

53 skillrack 2020 june ab# 123 4c 10L K7 H hundred 001

Output:

ab# Η 2020 1 23 skillrack june 4c 10L K7 hundred 001
*/
