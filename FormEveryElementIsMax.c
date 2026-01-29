void maximizeInteger(int M, int arr1[], int N, int arr2[])
{
    int i, j, t, idx = 0;

    /* Sort arr2 in descending order */
    for (i = 0; i < N - 1; i++) {
        for (j = i + 1; j < N; j++) {
            if (arr2[j] > arr2[i]) {
                t = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = t;
            }
        }
    }

    /* Replace digits to maximize arr1 */
    for (i = 0; i < M && idx < N; i++) {
        if (arr2[idx] > arr1[i]) {
            arr1[i] = arr2[idx];
            idx++;
        }
    }
}
/*
The function/method maximizelnteger accepts four arguments - M, arr1, N and arr2. The integer M represents the size of the integer array arr1. The integer N represents the size of the integer array arr2. Both arrays contain only digits. The digits in the array arr1 represents an integer value X.

The function/method maximizelnteger must maximize the value of X by replacing its digits with the digits in the array arr2.

Your task is to implement the function maximizelnteger so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

5 10356 3 197

Output 97356

Explanation:

The value of M is 5 and the given 5 integers are 1, 0, 3, 5 and 6.

The value of N is 3 and the given 3 integers are 1, 9 and 7.

After replacing the digit 1 in the arr1 with the digit 9 from arr2, the array becomes 90356.

After replacing the digit 0 in the arr1 with the digit 7 from arr2, the array becomes 97356

Example Input/Output 2:

Input:

6 891262 4 4444

Output 894464
*/
