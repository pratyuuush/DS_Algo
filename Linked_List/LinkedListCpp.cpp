#include <iostream>
using namespace std;

class Node
{
    public:
        int data;
        Node *next;
};

void insertFirst(Node** head_ref, int data)
{
    Node* new_node = new Node();

    new_node->data = data;
    new_node->next = (*head_ref);
    *head_ref = new_node;
}

void insertLast(Node** head_ref, int data)
{
    Node *new_node = new Node();
    new_node->data = data;
    new_node->next = NULL;

    if(*head_ref == NULL)
    {
        *head_ref = new_node;
        return;
    }

    Node* last = *head_ref;

    while(last->next != NULL)
    {
        last = last->next;
    }

    last->next = new_node;
    return;
}


void deleteFirst(Node** head_ref)
{
    if(*head_ref == NULL)
    {
        cout << "List is empty" << endl;
        return;
    }

    Node *n = *head_ref;
    n = n->next;

    *head_ref = n;
}

void deleteLast(Node** head_ref)
{
    if(*head_ref == NULL)
    {
        cout << "List is empty" << endl;
        return;
    }

    Node *n = *head_ref;
    Node *prev;

    while(n->next != NULL)
    {
        prev = n;
        n = n->next;
    }

    prev->next = NULL;
}

void printList(Node *n)
{
    while(n != NULL)
    {
        cout << " " << n->data;
        n = n->next;
    }
    cout << endl;
}

int main()
{
    Node *head = NULL;
    insertFirst(&head,10);
    insertFirst(&head, 20);
    insertFirst(&head, 30);
    insertFirst(&head, 40);
    insertLast(&head, 50);

    printList(head);
    deleteFirst(&head);
    deleteLast(&head);
    printList(head);

    return 0;
}

/*#include <iostream>
using namespace std;

class Node
{
    public:
        int data;
        Node *next;
};

void insertFirst(Node** head, int data)
{
    Node* new_node = new Node();

    new_node->data = data;

    new_node->next = (*head);
    (*head) = new_node;
}

void printList(Node *n)
{
    while(n != NULL)
    {
        cout << " " << n->data;
        n = n->next;
    }
}

int main()
{
    Node *head = NULL;
    insertFirst(&head,1);
    insertFirst(&head,2);
    printList(head);

    return 0;
}*/

