import java.util.*;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int n1 = s1.length();
        int n2 = s2.length();

        char[] s3 = new char[n1 + n2];

        int left = 0;
        int right = s3.length - 1;

        int i = 0;

        // Compare same positions
        while (i < n1 && i < n2) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 <= c2) {
                s3[left++] = c1;
                s3[right--] = c2;
            } else {
                s3[left++] = c2;
                s3[right--] = c1;
            }
            i++;
        }

        // Remaining characters of s1
        while (i < n1) {
            s3[left++] = s1.charAt(i++);
        }

        // Remaining characters of s2
        while (i < n2) {
            s3[left++] = s2.charAt(i++);
        }

        System.out.println(new String(s3));
    }
}

