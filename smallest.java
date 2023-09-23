import java.io.*;
import java.util.*;
public class smallest 
{
 public static void main(String args[])
 {
    Scanner obj=new Scanner(System.in);
    int i;
    System.out.println("Enter the size of the arary");
    int size = obj.nextInt();
    int a[] = new int[size];
    int min=a[0];
    System.out.println("Enter the elements of the array");
    for(i=0;i<size;i++)
    {
        a[i]=obj.nextInt();
    }
    for(i=0;i<size;i++)
    {
        if(a[i]<min)
        {
            a[i]=min;
        }
    }
    System.out.println("Smallest element of the array"+min);

 }   
}
