import java.io.*;
import java.util.*;
public class add {
    public static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter two integers :");   
    int a=0,b=0,sum=0;
    a = obj.nextInt();
    b = obj.nextInt();
    sum = a+b;
    System.out.println("Sum ="+sum);
}
}
