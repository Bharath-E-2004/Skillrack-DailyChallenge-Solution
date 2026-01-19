int FindMinMaxInTwoArrays(int SIZE1, int arr1[], int SIZE2, int arr2[], int K) {
    int X = 0; // count of elements in arr1 greater than K
    int Y = 0; // count of elements in arr2 smaller than K

    // Count elements greater than K in arr1
    for(int i = 0; i < SIZE1; i++) {
        if(arr1[i] > K) {
            X++;
        }
    }

    // Count elements smaller than K in arr2
    for(int i = 0; i < SIZE2; i++) {
        if(arr2[i] < K) {
            Y++;
        }
    }

    // Return the maximum of X and Y
    return (X > Y) ? X : Y;
}
/*
The function/method find MinMaxinTwoArrays accepts five arguments - SIZE1, arr1, SIZE2, arr2 and K. The integer SIZE1 represents the size of the integer array arr1. The integer SIZE2 represents the size of the integer array arr2. K represents an integer value.

The function/method find MinMaxin TwoArrays must find the count of integers greater than K in the array arr1 as X and the count of integers smaller than K in the array arr2 as Y. Then the function must return an integer representing the maximum value between X and Y.

IMPORTANTS Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

56

10 17 13 6 16

15 8 23 6 33 78

10

Output

3

Explanation:

Here K 10.

There are 3 integers greater than 10 in the 1st array -> 17, 13 and 16.

There are 2 integers smaller than 10 in the 2nd array -> 8 and 6.

The maximum value between 3 and 2 is 3.

Hence 3 is printed as the output.

Example Input/Output 2: Input

76

68 92 94 12 34 93 14

90 27 37 26 12 83

50

Output

4
*/
