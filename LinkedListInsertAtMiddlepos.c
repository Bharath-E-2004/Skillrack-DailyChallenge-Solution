struct Node* insertNodeAtMiddle(struct Node* head, int data) {
    // Create new node
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;

    // Case 1: Empty list
    if (head == NULL) {
        newNode->next = newNode->prev = newNode;
        return newNode;
    }

    // Step 1: Count nodes
    int count = 1;
    struct Node* temp = head->next;
    while (temp != head) {
        count++;
        temp = temp->next;
    }

    // Step 2: Traverse to (count/2)th node (0-based index)
    int mid = count / 2;
    temp = head;
    for (int i = 0; i < mid; i++) {
        temp = temp->next;
    }

    // Step 3: Insert before temp
    struct Node* prevNode = temp->prev;
    newNode->next = temp;
    newNode->prev = prevNode;
    prevNode->next = newNode;
    temp->prev = newNode;

    return head;
}

/*
struct Node{

int data;

struct Node "prev, "next;

};

Example Input/Output 1:

Input:

4

37 91 77 22

50

Output:

CDLL:

37 91 50 77 22

22 77 50 91 37

Explanation:

Here N = 4 and the given 4 integers are 37 91 77 22.

After inserting the node with the data 50 at the middle of the CDLL, the CDLL becomes 37 91

50 77 22.

Hence the output is

CDLL:

37 91 50 77 22

22 77 50 91 37

Example Input/Output 2:

Input:

6

30 15 20 45 80 50

70

Output:

CDLL:

30 15 20 70 45 80 50

50 80 45 70 20 15 30
*/
