import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Testbufferedreader
{   
    public static void main(String args[])throws IOException
    {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the name");
    String name = reader.readLine();
    System.out.println(name);
    }
}    
