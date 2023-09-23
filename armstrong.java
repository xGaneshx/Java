import java.io.*;
import java.util.*;
public class armstrong {
    public static void main(String args[])
    {
        int num=0,digit,temp=0,sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter an Integer");
        num = obj.nextInt();
        temp = num;
        while(num>0)
        {
          digit = num%10;
          num = num/10;
          sum = sum + digit*digit*digit;
          
        }
        if(temp==sum)
        {
        
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("not armstrong");

        }
        
            
        
    }
}
