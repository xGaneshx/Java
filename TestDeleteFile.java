import java.io.File;
public class TestDeleteFile 
{
 public static void main(String args[])
 {
    File obj =new File("filename.txt");
    if(obj.delete())
    {
        System.out.println("The file is deleted" +obj.getName());
    }
    else
    {
        System.out.println("Deletion of file was not succesful");
    }

 }    
}
