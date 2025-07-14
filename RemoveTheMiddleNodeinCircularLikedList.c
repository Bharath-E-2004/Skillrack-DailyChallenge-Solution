#include <stdio.h>
#include <stdlib.h>

// Define the structure
struct Node {
    int data;
    struct Node* next;
    struct Node* prev;
};

// Function to delete the middle node
struct Node* deleteAtMiddle(struct Node* head) {
    if (head == NULL || head->next == head) {
        // Empty list or single node
        return NULL;
    }

    // Count the number of nodes
    int count = 1;
    struct Node* temp = head;
    while (temp->next != head) {
        count++;
        temp = temp->next;
    }

    // Find the middle position
    int mid = count / 2;

    // Traverse to the middle node
    temp = head;
    while (mid--) {
        temp = temp->next;
    }

    // Remove the middle node
    temp->prev->next = temp->next;
    temp->next->prev = temp->prev;

    // If the head was the middle node, update it
    if (temp == head) {
        head = temp->next;
    }

    free(temp);
    return head;
}
/*
Your task is to implement the function deleteAtMiddle so that it passes all the test cases.

Note: The number of nodes in the given CDLL is always odd.

The following structure is used to represent the Node and is already defined in the default code (Do not write this definition again in your code).

struct Node

int data;

struct Node "prev, *next;

};

4

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

5

12 56 89 40 74

Output

CDLL:

12 56 40 74
74 40 56 12

Explanation:

After deleting the middle node of the given CDLL, the CDLL becomes 12 56 40 74.

Hence the output is

CDLL:

12 56 40 74
74 40 56 12

Example Input/Output 2:

Input:

7

69 50 7 30 16 49 25

Output:

CDLL:

69 50 7 16 49 25 
25 49 16 7 50 69
*/
