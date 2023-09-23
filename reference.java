import java.io.*;

class student{
int id;
String name;    
}
public class reference
{
    public static void main(String args[])
    {
    student obj = new student();
    obj.id =101;
    obj.name ="Ganesh";
    System.out.println(obj.id);
    System.out.println(obj.name);
    }
}