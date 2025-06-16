import java.util.*;

public class Hello {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

int ind=0;

int sum=0;

while(sc.hasNextLine()){

String str=sc.nextLine();

if(ind%2==0)

System.out.print(str+" ");

else

sum+=Integer.parseInt(str);
ind++;
}

System.out.println("\n"+sum);

System.exit(0);

}

}
/*
  Please convert the following C code to Java so that the Java program executes successfully passing the test cases.

#include <stdio.h>

#include <stdlib.h>

int main()

{

char str[101], words [10001]; int rowCount = 0, sum = 0, index = 0; while(scanf("%s\n", str) = 1) {

rowCount++;

if(rowCount & 1)

{ index += sprintf(words+index, "%s", str);

}

else

{

sum += atoi(str);
}
} printf("%s\n%d", words, sum);

return 0;

}
*/
