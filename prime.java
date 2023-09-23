import java.io.*;
import java.util.*;
public class prime 
{
 public static void main(String args[])
 {
    int num=0,i=0,count=0;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter an Integer");
    num = obj.nextInt();
    for(i=1;i<=num;i++)
    {
        if(num%i==0)
        {
            count++;
        }
    }
    if(count==2)
    {
        System.out.println(num+"is Prime");
    }
    else
    {
        System.out.println(num+"is not Prime");
    }
 }   
}