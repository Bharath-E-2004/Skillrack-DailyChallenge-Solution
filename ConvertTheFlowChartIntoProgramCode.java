import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        while (X > 0 || Y > 0) {
            if (X > 0) {
                System.out.println("X: " + X);
                Y -= 1;
            } else if (Y > 0) {
                System.out.println("Y: " + Y);
                X -= 1;
            }
               X -= 1;
               Y -= 1;
        }

        sc.close();
    }
}
