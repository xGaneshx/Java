import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TryReadFIle
{
  public static void main(String args[])
  {
  try
  {
    File obj=new File("filename.txt");
    Scanner read=new Scanner(obj);
    while(read.hasNextLine())
    {
      String data=read.nextLine();
      System.out.println(data);
    }
    read.close();
  }catch(FileNotFoundException e){System.out.println("An error occurred");
  e.printStackTrace();
}
  }
}
    

