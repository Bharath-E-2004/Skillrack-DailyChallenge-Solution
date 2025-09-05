import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int count = (num2 - num1 + 1) * (ch2 - ch1 + 1);
        int diff = (num2 - num1 + 1);

        for (char start = ch1; start <= ch2; start++) {
          for(int i=num1;i<=num2;i++){
            char print = ch1;
            int number = num1;
            for (int k = 1; k <= count; k++) {
                int j = number;
                System.out.printf("%c%d.%c.%d\n", start, j, print, number++);
                if (number > num2) number = num1;
                if (k % diff == 0) print++;
            }
          }
        }
    }
}
/*
Sample Input:
a c
1 3

OutPut:

a1.a.1
a1.a.2
a1.a.3
a1.b.1
a1.b.2
a1.b.3
a1.c.1
a1.c.2
a1.c.3
a2.a.1
a2.a.2
a2.a.3
a2.b.1
a2.b.2
a2.b.3
a2.c.1
a2.c.2
a2.c.3
a3.a.1
a3.a.2
a3.a.3
a3.b.1
a3.b.2
a3.b.3
a3.c.1
a3.c.2
a3.c.3
b1.a.1
b1.a.2
b1.a.3
b1.b.1
b1.b.2
b1.b.3
b1.c.1
b1.c.2
b1.c.3
b2.a.1
b2.a.2
b2.a.3
b2.b.1
b2.b.2
b2.b.3
b2.c.1
b2.c.2
b2.c.3
b3.a.1
b3.a.2
b3.a.3
b3.b.1
b3.b.2
b3.b.3
b3.c.1
b3.c.2
b3.c.3
c1.a.1
c1.a.2
c1.a.3
c1.b.1
c1.b.2
c1.b.3
c1.c.1
c1.c.2
c1.c.3
c2.a.1
c2.a.2
c2.a.3
c2.b.1
c2.b.2
c2.b.3
c2.c.1
c2.c.2
c2.c.3
c3.a.1
c3.a.2
c3.a.3
c3.b.1
c3.b.2
c3.b.3
c3.c.1
c3.c.2
c3.c.3
*/
