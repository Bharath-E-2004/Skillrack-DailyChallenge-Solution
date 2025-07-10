import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();

        System.out.println(str1);

        int len1 = str1.length();
        int len2 = str2.length();
        int len3 = str3.length();

        int rows = Math.max(len2, len3);
        int cols = Math.max(len1, Math.max(len2, len3));

        int ind1 = str1.indexOf(str2.charAt(0));
        int ind2 = str1.indexOf(str3.charAt(0));
        if(ind1==ind2) str1.index(str3.charAt(0),ind1);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i < len2 - 1 && j == ind1) {
                    System.out.print(str2.charAt(i + 1));
                } else if (i < len3 - 1 && j == ind2) {
                    System.out.print(str3.charAt(i + 1));
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
/*
The program must accept three string values S1, S2 and S3. S1 will be printed as the first row of a matrix. 
S2 and S3 will be printed vertically in the column where their first alphabets match with that of the alphabet in S1.
If both S2 and S3 have same first alphabet then, S2 will be considered over S3. 
The output pattern must be as shown in the Example Input/Output section. Assume always S1 will have the starting alphabets of S2 and S3.
*/
