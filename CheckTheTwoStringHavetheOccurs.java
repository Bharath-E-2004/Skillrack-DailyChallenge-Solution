import java.util.*;

class Pair {
    char alpha;
    int count;

    public Pair(char alpha, int count) {
        this.alpha = alpha;
        this.count = count;
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(checkStrings(str1, str2) ? "Yes" : "No");
    }

    private static boolean checkStrings(String str1, String str2) {
        Stack<Pair> s1 = groupCharacters(str1);
        Stack<Pair> s2 = groupCharacters(str2);

        if (s1.size() != s2.size()) return false;

        Pair p1 = s1.pop();
        Pair p2 = s2.pop();

        if (!check(p1, p2) || p2.count%p1.count!=0) return false;

        int lastRatio = p2.count / p1.count;

        while (!s1.isEmpty()) {
            p1 = s1.pop();
            p2 = s2.pop();

            int currRatio = p2.count / p1.count;

            if (!check(p1, p2) || lastRatio != currRatio || p2.count%p1.count!=0) return false;

            lastRatio = currRatio;
        }

        return true;
    }

    private static Stack<Pair> groupCharacters(String str) {
        Stack<Pair> stack = new Stack<>();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                stack.push(new Pair(str.charAt(i - 1), count));
                count = 1;
            }
        }

        stack.push(new Pair(str.charAt(str.length() - 1), count));
        return stack;
    }

    private static boolean check(Pair p1, Pair p2) {
        return p1.alpha == p2.alpha;
    }
}
