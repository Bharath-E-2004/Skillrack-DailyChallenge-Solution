import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long S1 = 0, S2 = 0;

        List<Integer> parts = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String s = sc.next();

            // S1: remove '|'
            S1 += Long.parseLong(s.replace("|", ""));

            // Split into two parts
            String[] arr = s.split("\\|");
            parts.add(Integer.parseInt(arr[0]));
            parts.add(Integer.parseInt(arr[1]));
        }

        // Sort 2N integers
        Collections.sort(parts);

        // Merge every two and calculate S2
        for (int i = 0; i < parts.size(); i += 2) {
            String merged = parts.get(i) + "" + parts.get(i + 1);
            S2 += Long.parseLong(merged);
        }

        System.out.print(S1 + " " + S2);
    }
}
