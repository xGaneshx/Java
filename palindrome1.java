import java.io.*;
import java.util.*;
public class palindrome1 
{
 public static void main(String args[])
 {
    String str,rev="";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string :");
    str = sc.nextLine();
    int length = str.length();
    for(int i=length-1;i>=0;i--)
    {
        rev =  rev + str.charAt(i);
    }
    if(str.equals(rev))
    {
        System.out.println("palindrome");
    }
    else
    {
        System.out.println("not palindrome");    
    }
 }   
}
