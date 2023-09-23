import java.io.*;
import java.util.*;
class string
{
public static void main(String args[])
{
string1 m =new string1();
Scanner Obj=new Scanner(System.in);
System.out.println("enter the string");
 String s=Obj.nextLine();
System.out.println("enter the string to find palindrome");
 String p=Obj.nextLine();
m.freq(s);
m.pal(p);
}
}
class string1
{
void freq(String str)
{
Scanner Obj=new Scanner(System.in);
System.out.println("char freq?");
char character=Obj.nextLine().charAt(0);
      int count=0,length;
        String str1=str.toLowerCase(); 
      for (int i=0;i<str.length(); i++)
      {
         if(character==str1.charAt(i))
         {
            count++;
         } 
      }    
System.out.println("frequency="+count);          
}
void pal(String str)
{
String reverseStr="";
    for (int i = (str.length() - 1); i >=0; --i) 
    {
      reverseStr = reverseStr + str.charAt(i);
    }
if (str.toLowerCase().equals(reverseStr.toLowerCase())) 
    {
      System.out.println(str + " is a Palindrome String.");
    }
    else 
    {
      System.out.println(str + " is not a Palindrome String.");
    }

}
}