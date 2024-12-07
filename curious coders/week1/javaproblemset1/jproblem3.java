import java.util.Scanner;
class Main{
  public static void main(String [] args)
  {
     Scanner sc= new Scanner(System.in);
     int num1=sc.nextInt();
     
     if(num1>=90)
     {
         System.out.println("grade A");
     }
     else if (num1>=80)
     {
         System.out.println("grade B");
     }
     else if (num1>=60)
     {
         System.out.println("grade C");
     }
     else if (num1>=35)
     {
         System.out.println("grade D");
     }
     else
     {
         System.out.println("fail");
     }
    
  }
}