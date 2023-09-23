import java.io.*;
import java.util.*;
public class arithexcep 
{
  public static void main(String args[]) throws ArithmeticException{
    Scanner sc = new Scanner(System.in);
    try
    {
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        int c = a/b;
        System.out.println("out:"+c);        
    }
    catch(ArithmeticException e)
    {
        System.out.println("not possible");
    }
    finally
    {
        System.out.println("End of operation");
    }
  }  
}
