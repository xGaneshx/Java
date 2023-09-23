import java.io.FileWriter;
import java.io.IOException;
public class testfilewriter 
{
  public static void main(String args[])
  {
    try
    {
      FileWriter obj=new FileWriter("Filename.txt");
      obj.write("Files in java are tricky but it's alright");
      obj.close();
      System.out.println("Successfully written in a file");
    }catch(IOException e)
    {
        System.out.println(e);
    }
  }  
}
