import java.util.*;

public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] S = sc.nextLine().split(" ");

        boolean caps = false; // CAPSLOCK initially OFF
        StringBuilder result = new StringBuilder();

        for (String key : S) {

            if (key.equals("CAPSLOCK")) {
                caps = !caps; // toggle CAPSLOCK
            }

            else if (key.startsWith("SHIFT+")) {
                String word = key.split("\\+")[1];
                for (char c : word.toCharArray()) {
                    result.append(toggle(c));
                }
            }

            else { // normal letters
                for (char c : key.toCharArray()) {
                    if (caps)
                        result.append(Character.toUpperCase(c));
                    else
                        result.append(Character.toLowerCase(c));
                }
            }
        }

        System.out.println(result.toString());
    }

    // Toggle case
    public static char toggle(char c) {
        if (Character.isUpperCase(c))
            return Character.toLowerCase(c);
        else
            return Character.toUpperCase(c);
    }
}

/*
The program must accept a string S representing the keys that are used to type a message in a text editor. The keys can be any of the following.

- All 26 lower case alphabets.

"SHIFT" key.

"CAPSLOCK" key.

Initially, the CAPSLOCK is turned off. The alphabets that occur after "SHIFT+" must be toggled(upper to lower or lower to upper). The program must find the message from the given string and print it is as the output.

Boundary Condition(s):

1 <= Length of S <= 1000

Input Format:

The first line contains S.

Output Format:

The first line contains a string value representing the message.

Example Input/Output 1:

Input:

SHIFT+skill CAPSLOCK SHIFT+ack a b c

Output:

SkillRackABC

Explanation:

Initially, the CAPSLOCK = OFF.

SHIFT+s-> S

k-> k

1->1

1->1

K

TAR

1->1

CAPSLOCK ON.

r-> R

SHIFT+ack -> ack

-> A

b-B

CC

Hence the output is Skill RackABC:
*/
