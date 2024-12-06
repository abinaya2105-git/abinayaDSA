/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <string>
using namespace std;
int main() {
    int num1;
    int num2;
    int num3;
    int sum;
    cin >>num1 >>num2 >>num3;
    sum = num1+num2+num3;
    if(sum==180)
    {
        cout<<"triangle can be formed";
    }
    else
    {
        cout<<"triangle cannot be formed";
    }
    return 0;
}
