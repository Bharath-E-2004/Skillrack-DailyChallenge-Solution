#include <stdlib.h>

// Function to create a new Node
struct Node* createNode(int val) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->val = val;
    newNode->prev = NULL;
    newNode->next = NULL;
    return newNode;
}

// Function to convert integer to binary DLL
struct Node* getBinaryRepresentation(int N) {
    if (N == 0) {
        return createNode(0); // Edge case for N = 0
    }

    struct Node* head = NULL;
    struct Node* tail = NULL;

    while (N > 0) {
        int bit = N % 2;
        struct Node* newNode = createNode(bit);

        // Insert at the beginning (MSB at head)
        if (head == NULL) {
            head = tail = newNode;
        } else {
            newNode->next = head;
            head->prev = newNode;
            head = newNode;
        }

        N /= 2;
    }

    return head;
}

/*
  The function/method getBinary Representation accepts an argument N representing a positive integer value.

The function/method getBinaryRepresentation must return the binary representation of N as a doubly linked list (ie, the function must return the head of the resulting doubly linked list).

Your task is to implement the function getBinary Representation so that it passes all the test cases.

IMPORTANT: Do not write the main() function as it is already defined.

The following structure is used to represent the Node and is already defined in the default code (Do not write this definition again in your code).

struct Node

int vali

struct Node prev, "next;

};

4

Example Input/Output 1:

Input:

10

Output:

DLL: 1010

Reverse DLL: 0101

Explanation:

Here N-10.

The binary representation of 10 is 1010.

The doubly linked list contains 1010.

Example Input/Output 2:

Input

25

Output

DLL: 11001

Reverse DLL: 10011
*/
