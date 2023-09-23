import java.io.*;
import java.util.*;
public class palindrome {
    public static void main(String args[])
    {
        int r,sum=0,temp;    
        int n=0;  
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter an integer");
        n = obj.nextInt();
        temp=n;    
        while(n>0){    
         r=n%10;  
         sum=(sum*10)+r;    
         n=n/10;    
        }    
        if(temp==sum)    
         System.out.println("palindrome number ");    
        else    
         System.out.println("not palindrome");    
    }  
}  
    