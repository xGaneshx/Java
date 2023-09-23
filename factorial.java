import java.io.*;
import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        int fact=1,n=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter n");
        n = obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
    System.out.println(fact);
    }

}