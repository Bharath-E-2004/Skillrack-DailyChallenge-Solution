import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // Input size
        
        List<String> list = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                row.append(j).append(" ");
            }
            list.add(row.toString().trim());
        }

        // Print pattern
        for (String s : list) {
            System.out.println(s);
        }

        sc.close();
    }
}
