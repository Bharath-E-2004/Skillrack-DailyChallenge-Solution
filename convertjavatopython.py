import sys

r,c=0,0

Sum=0

for line in sys.stdin:
 r+=1
 lis=list(map(int,line.split()))
 if c==0:
  c=len(lis)
 Sum+=sum(lis)|
print(r,end="")
print(c)
print(Sum)

# Please convert the following Java code to Python so that the Python program executes successfully passing the test cases.

# import java.util.*;

# public class Hello {

# public static void main(String[] args) {

# Scanner sc new Scanner(System.in);

# int R=0, C=0, sum = 0;

# while (sc.hasNextLine()) {

# R++;

# }

# String currLine[] = sc.nextLine().trim().split("\\s+");

# if (C=0) {

# C currLine.length;

# }

# for (int index = 0; index < C; index++) {

# }

# sum += Integer.parseInt(currLine[index]);

# System.out.println(R+""+ C);

# System.out.println(sum);

# }
