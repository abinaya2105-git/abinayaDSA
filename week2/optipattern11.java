import java.util.Scanner;
public class Main{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Print leading spaces in one go
            System.out.print(" ".repeat(i-1));

            // Print stars in one go
            System.out.print("*".repeat((2*n)-(2 * i - 1)));

            // Move to the next line
            System.out.println();
        }
        
    }
}