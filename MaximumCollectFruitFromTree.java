import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < size; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        int max = 0;

        for(int i = 0; i < size; i++){
            int count = list.get(i) * (size - i);
            max = Math.max(count, max);
        }

        System.out.println(max);
    }
}
