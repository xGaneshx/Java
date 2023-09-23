import java.io.*;
import java.util.*;
public class m1 
{
  public static void main(String args[])
  {
    m2 m = new m2();
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the fact  ");
    int f = obj.nextInt();
    System.out.println("Enter the sum");
    int s = obj.nextInt();
    m.factorial(f);
    m.sum(s);
  }  
}
class m2
{
    void factorial(int n)
    {
        int i,fact = 1;
        for(i=1;i<n;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial="+fact);
    }

    void sum(int n)
    {
        int i,sum = 0;
        for(i=0;i<n;i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum="+sum);
    }
}
