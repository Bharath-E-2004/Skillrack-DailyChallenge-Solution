#include <stdio.h>

struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};

void swapChildren(struct Node* root, int X) {
    if (root == NULL)
        return;

    if (root->data == X && root->left && root->right) {
        // Swap left and right children
        struct Node* temp = root->left;
        root->left = root->right;
        root->right = temp;
        return;
    }

    swapChildren(root->left, X);
    swapChildren(root->right, X);
}
/*
The function/method swapChildren accepts two arguments root and X. The root is a pointer to the root node of a binary tree and X represents the value of node in the binary tree.

The function/method swapChildren must find the node with the value X in the given binary tree. if the node has two children, then the function must swap the children of the node. Else the function must not modify the binary tree.

Your task is to define the function swapChildren so that the program runs successfully.

The following structure is used to represent the Node and is already defined in the default code (Do not write this definition again in your code).

struct Node

{ }; int data; struct Node *left, right;

4

IMPORTANT:

- Do not write the main() function and print Preorder(root) function as they are already defined.

- Do not create any new nodes.

Input Format:

The first line contains N representing the number of nodes in the binary tree.

The second line contains the value of the root node.

The next N-1 lines, each contains the parent node's value, the child node's value and the position (L or R).

The (N+2)th line contains X.

Output Format:

The first line contains the pre-order traversal of the given binary tree before swapping the children of the node with the value X.

The second line contains the pre-order traversal of the given binary tree after swapping the children of the node with the value X.
*/
