#include <iostream>
using namespace std;

int main()
{
    int a = 10;
    int *b  = &a;
    int **c = &b;
    int ***d = &c;
    cout << **c << endl;
    
}