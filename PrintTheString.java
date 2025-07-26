import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        System.out.println(Arrays.toString(str));

        boolean enclosed = false;

        for (String s : str) {
            System.out.print(s.replace("\"", "") + " ");

            if (s.startsWith("\"") && !enclosed) {
                enclosed = true;
            }

            if (s.endsWith("\"") && enclosed) {
                enclosed = false;
                System.out.println(); // Line break after closing quote
            }
        }
    }
}
/*
Example Input/Output 1:

Input

cat dog "lion tiger" mosquito bee ant "snake cobra crocodile" cow

Output

cat

dog

lion tiger

mosquito

bee

ant

snake cobra crocodile

COW

Explanationc

The words lion and tiger are enclosed within double quotes.

Similarly, the words snake cobra and crocodile are enclosed within double quotes After dividing the string S based on the given conditions, the words become

cat

dog

lion tiger

mosquito

bee

ant

snake cobra crocodille

COME
*/
