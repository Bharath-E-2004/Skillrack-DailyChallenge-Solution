struct Node* insertLinkedList(struct Node* head1, struct Node* head2, int k) {
    struct Node* t1 = head1;

    // Traverse to the k-th node
    for (int i = 0; i < k && t1 != NULL; i++) {
        t1 = t1->next;
    }

    if (t1 == NULL) return head1;  // If k is beyond the list length

    // Insert head2 after k-th node
    struct Node* temp = t1->next;
    t1->next = head2;

    // Traverse to the end of head2
    struct Node* t2 = head2;
    while (t2 != NULL && t2->next != NULL) {
        t2 = t2->next;
    }

    // Connect remaining part
    if (t2 != NULL) {
        t2->next = temp;
    }

    return head1;
}
/*
The function/method insertLinkedList must insert the second liman antar the node in the first linked list and return the revised head of the first linked list

Your task is to implement the function InsertLinkedList so that it passes all the test cases.

The following structure is used to represent the Node and is already defined in the default code (Do not write this definition again in your code).

struct Node

int val;

struct Node "next;

};

4

Note: The value of K is always less than or equal to the number of nodes in the first linked list.

IMPORTANT:

- Do not write the main() function as it is already defined.

- You must not create any new nodes.

Example Input/Output 1:

Input:

5

10 15 20 25 30

4

16 17 18 19

2

Output:

Linked List:

10 15 16 17 18 19 20 25 30

Explanation:

Here the value of K is 2.

First linked list: 10 -> 15 -> 20 -> 25 -> 30.

Second linked list: 16 -> 17 -> 18 -> 19.

After inserting the second linked list after 2nd node in the first linked list, the list becomes

10 -> 15->16 -> 17 - 18 - 19 - 20 -> 25 -> 30.

Hence the output is

Linked List:

10 15 16 17 18 19 20 25 30
*/
