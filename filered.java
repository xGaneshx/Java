import java.io.File;
import java.io.*;
import java.io.FileInputStream;
public class filered 
{
  public static void main(String args[])
  {
    try
    {
        File f =new File("text.txt");
        FileInputStream fr = new FileInputStream(f);
        long len=f.length();
        int count_i=0;
        int count_a=0;
        for(int i=0;i<=len;i++)
        {
            char ch =(char)fr.read();
            if(ch=='a')
            {
                count_a++;
            }
            if(ch=='i')
            {
                count_i++;
            }
        }
        System.out.println("no of a :" +count_a); 
        System.out.println("no of i :" +count_i); 
    }catch(Exception e){System.out.println(e);}
  
}  
}
