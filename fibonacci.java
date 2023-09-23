import java.io.*;
import java.util.*;
class fibonacci 
{
    public static void main(String args[])
    {
        int a=0,b=1,temp=0,n=0;
        Scanner obj = new Scanner(System.in); 
        System.out.println("Enter n \t");
        n = obj.nextInt();
        System.out.println(a);
        System.out.println(b); 
       
       for(int i=0;i<=n;i++)
      {
            temp = a+b;
            a=b;
            b = temp;
            System.out.println(temp);
          

        }
    }
    
}
