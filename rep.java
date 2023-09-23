import java.io.*;
import java.util.*;
public class rep {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int i;
        System.out.println("Enter the size of the array");
        int size = obj.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the elements of the array");
        for(i=0;i<size;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("Enter the position to be changed");
        int c=obj.nextInt();
        System.out.println("Enter the replacement character");
        int b=obj.nextInt();
        a[c]=b;
        System.out.println("New Array");
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }

    }
    
}
