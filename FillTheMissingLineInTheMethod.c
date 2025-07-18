#include <stdio.h>
#include <stdlib.h>

int main() {
    int X, Y;
    scanf("%d %d", &X, &Y);

    for (int val = X; val <= Y; val++) {
        int temp = val;
        while (temp > 0) {
            if ((temp % 10) % 2) {
                break;
            }
            temp /= 10;
        }

        if (temp != 0) {
            printf("%d ", val);
        }
    }

    return 0;
}
/*
The program must accept two integers X and Y (where X < Y) as the input.
In the range from X to Y, the program must print the integers having at least one odd digit as the output.
Please fill in the missing lines of code so that the program runs successfully.

Input Format:

The first line contains X and Y separated by a space.

Output Format:

The first line contains the integers values based on the given conditions.

Example Input/Output 1:

Input:

200 240

Output:

201 203 205 207 209 210 211 212 213 214 215 216 217 218 219 221 223 225 227 229 230 231 232 233 234 235 236 237 238 239
Explanation:
 Here X 200 and Y 240.
In the range from 200 to 240, the integers with at least one digit are printed.

Example Input/Output 2:

Input

4880 - 4910

Output:

4831 4883 4885 48874889 4890 4891 4892 4893 4894 4895 4896 4897 4898 4899 4900 4901 4902 4903 4904 4905 4906 4907 4908 4909 4910
*/
