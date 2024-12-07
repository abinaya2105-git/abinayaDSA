import java.util.Scanner;
class Main{
  public static void main(String [] args)
  {
     Scanner sc= new Scanner(System.in);
     int num=sc.nextInt();
     String name=sc.next();
     char letter=sc.next().charAt(0);
     System.out.println(num);
     System.out.println(name);
     System.out.println(letter);
    
  }
}