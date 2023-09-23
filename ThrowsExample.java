import java.io.*;
class Example 
{
 void thr(int num)throws IOException,ClassNotFoundException
 {
    if(num==1)
    System.out.println("IOException Occurred");
    else
    System.out.println("Classnotfound exception occurred");
 }   
}
public class ThrowsExample
{
    public static void main(String args[])
    {
        try
        {
        Example obj=new Example();
        obj.thr(1);
        }catch(Exception ex){System.out.println(ex);}
    }
}    

