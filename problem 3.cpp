#include <iostream>
#include <string>
using namespace std;
int main() {
    int num1;
    cin>>num1;
    
    if(num1>=90)
    {
        cout<<"grade A";
    }
    else if(num1>=80)
    {
        cout<<"grade B";
    }
    else if(num1>=60 )
    {
        cout<<"grade C";
    }
    else if(num1>=35 )
    {
        cout<<"grade D";
    }
    else if(num1<=35 )
    {
        cout<<"Fail";
    }
    return 0;
}
