#include <stdio.h>
#include <stdlib.h>

// Function to count shoe pairs
int countShoePairs(int N, int arr[]) {
    // Sort the array using simple bubble sort
    for (int i = 0; i < N; i++) {
        for (int j = i + 1; j < N; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    int count = 0;
    for (int i = 0; i < N - 1; i++) {
        if (arr[i] == arr[i + 1]) {
            count++;
            i++; // Skip the next one since it's already paired
        }
    }

    return count;
}

int main() {
    int N;
    scanf("%d", &N);

    int arr[N];
    for (int i = 0; i < N; i++) {
        scanf("%d", &arr[i]);
    }

    printf("%d\n", countShoePairs(N, arr));
    return 0;
}
/*
The function/method countShoePairs accepts two arguments N and arr. The integer N represents the number of shoes in a shop. The integer array arr represents the colours of the N shoes. All N shoes are the same size.

The function/method countShoePairs must return an integer representing the number of matching pairs of shoes that are available.

Your task is to implement the function countShoePairs so that the program runs successfully.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

9

15 25 25 15 15 35 45 15 25

Output

3

Explanation:

The 3 shoe pairs are (15, 15), (25, 25) and (15, 15).

Example Input/Output 2:

Input:

4

10 10 10 10

Output:

2
*/
