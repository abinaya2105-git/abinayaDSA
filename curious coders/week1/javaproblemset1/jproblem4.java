import java.util.Scanner;
public class Main{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n){
            case 29:
                System.out.println("Small");
                break;
            case 30:
                System.out.println("Medium");
                break;
            case 38:
                System.out.println("Large");
                break;
            case 42:
                System.out.println("Xlarge");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}