import java.util.Scanner;
public class Main{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        String firstname=sc.next();
        String lastname=sc.next();
        String fullname=firstname+lastname;
        int x=sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            System.out.println(fullname);
        }
    }
}