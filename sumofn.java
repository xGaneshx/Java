import java.io.*;
import java.util.*;
public class sumofn {
    public static void main(String args[])
    {
    int n=0,sum=0,i=0;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter n");
    n = obj.nextInt();
    for(i=0;i<=n;i++)
    {
        sum =sum + i;

    }
    System.out.println(sum);
}
}