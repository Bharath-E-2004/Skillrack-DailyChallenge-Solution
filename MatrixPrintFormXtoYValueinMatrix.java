import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        // Flatten matrix into a list
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                list.add(sc.nextInt());
            }
        }

        int X = sc.nextInt();
        int Y = sc.nextInt();

        // Find indices of X and Y
        int indX = list.indexOf(X);
        int indY = list.indexOf(Y);

        // Print elements circularly from X to Y
        int i = indX;
        while (true) {
            System.out.print(list.get(i) + " ");
            if (list.get(i) == Y) break;
            i = (i + 1) % list.size(); // circular move
        }
    }
}
