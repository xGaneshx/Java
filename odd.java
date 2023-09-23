import java.io.*;
import java.util.*;
public class odd {
    public static void main(String args[])
    {
    int a=0;
    System.out.println("Enter an integer");
    Scanner obj = new Scanner(System.in);
    a = obj.nextInt();
    if(a%2==0)
    {
    System.out.println("The number is even");
    }
    else 
    {
    System.out.println("The number is odd");
    }
}
}
