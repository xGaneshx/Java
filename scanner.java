import java.io.*;
import java.util.*;
class scanner
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        String username;

        System.out.println("Enter Username");
        username = obj.nextLine();
        System.out.println("Username :"+username);
    }
}