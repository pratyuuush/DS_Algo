#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next = NULL;
    Node(int d)
    {
        data = d;
    }
};

void insertFirst(Node **head, int data)
{
    Node *new_node = new Node(data);

    new_node->next = *head;
    *head = new_node;
}

void deleteFirst(Node **head)
{
    Node *n = *head;

    n = n->next;

    *head = n;
}

void printList(Node *n)
{
    if (n == NULL)
    {
        cout << "List is empty" << endl;
    }

    while (n != NULL)
    {
        cout << n->data << " ";
        n = n->next;
    }

    cout << endl;
}

int main()
{
    Node *head = NULL;
    insertFirst(&head, 10);
    insertFirst(&head, 20);
    printList(head);
    printList(head);

    return 0;
}
