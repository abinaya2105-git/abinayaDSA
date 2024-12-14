import java.util.Scanner;
public class Main{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=x;i>=1;i--)
        {
         for(int j=i;j>=1;j--)
         {
            System.out.print(j);
         }
         System.out.println(" ");
        }
        
    }
}