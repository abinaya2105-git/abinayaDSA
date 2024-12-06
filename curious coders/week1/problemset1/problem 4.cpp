#include <iostream>
#include <string>
using namespace std;
int main() {
    int size;
    cin>>size;
    switch(size)
    {
        case 29:
           cout<<"small";
           break;
        case 30:
           cout<<"medium";
           break;
        case 38:
           cout<<"Large";
           break;
        case 42:
           cout<<"Xlarge";
           break;
        default:
           cout<<"Invalid size";
           break;
    }
    return 0;
}  
