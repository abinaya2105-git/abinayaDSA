#include <iostream>
#include <string>
using namespace std;
int main()
{
   string firstn,lastn,fullname;
   int n;
   cin>>firstn>>lastn>>n;
   for(int i=1;i<=n;i++)
   {
       fullname= firstn+lastn;
       cout<<fullname<<endl;
   }
   

    return 0;
}