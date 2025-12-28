import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }

        // Step 1: Find the common character
        char common = 0;
        String first = arr[0];

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            boolean presentInAll = true;

            for (int j = 1; j < N; j++) {
                if (arr[j].indexOf(ch) == -1) {
                    presentInAll = false;
                    break;
                }
            }

            if (presentInAll) {
                common = ch;
                break;
            }
        }

        // Step 2: Remove prefixes
        List<String> result = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int index = arr[i].indexOf(common);
            result.add(arr[i].substring(index));
        }

        // Step 3: Sort and print
        Collections.sort(result);
        for (String s : result) {
            System.out.println(s);
        }
    }
}

/*
The program must accept N string values containing only lower case alphabets as the input. All string values start with the same alphabet, but a certain number (possibly 0) of other alphabets appear before each string value. The program must remove those alphabets before each string, then the program must print the string values in sorted order.

Note: There will be exactly one common character in the given N string values.

Boundary Condition(s):

2<= N <= 100

1<= Length of each string <= 100

Input Format:

The first line contains N.

The next N lines, each contains N string values separated by a space.

Output Format:

The first N lines contain the string values in sorted order.

Example Input/Output 1:

Input:

5

pqreight

cdgelephant

xyeat

abeagle

hijklegg

Output:

eagle

eat

egg eight

elephant
*/
