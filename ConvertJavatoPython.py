import sys
sb=""
for line in sys.stdin:
  for s in line.strip().split(" "):
    sb+=s[len(s)-1]
print(sb[::-1])


# Java-Python-027

# Please convert the following Java code to Python so that the Python program executes successfully passing the test cases.

# import java.util.*;

# public class Hello {

# public static void main(String[] args) {

# Scanner sc new Scanner(System.in);

# StringBuilder sb = new StringBuilder();

# while (sc.hasNextLine()) {

# String currLine[] = sc.nextLine().trim().split("\\s+");

# for (String word: currLine) {

# }

# sb.append(word.charAt(word.length() - 1));

# } System.out.println(sb.reverse().toString());

# }
# }
