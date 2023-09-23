import java.io.File;
import java.io.IOException;
public class CreateFile 
{ 
    public static void main(String args[])
    {
        try
        {
          File obj=new File("filename.txt");
          if(obj.createNewFile())
          {
            System.out.println("File Created"  +obj.getName());
          }
          else
          {
            System.out.println("File already exists");
          }
        }catch(IOException e)
        {
            System.out.println("An error occurred");
            e.getStackTrace();
        }
    }
    
}
