import java.io.*;
import java.util.*;
class func
{
  public static void main(String args[])
  {
    factsum num = new factsum(); 
    int c = factsum.fact(5);
     int x = factsum.sum(5);
     System.out.println(c);
     System.out.println(x);
  }

}
class factsum
{   
    
    static int fact(int n)
{
    for(int i=0;i<n;i++)
    {
       int fact = fact*i; 
    }
    return fact;
}
   static int sum(int n)
   {
    for(int i=0;i<n;i++)
    {
        int sum = sum + i;
    }
    return sum;
   }
   
   
}
