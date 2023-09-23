import java.io.*;
class student
{
    int rollno;
    String name;
    int age;
student(int rollno,String name,int age)
{
    this.rollno=rollno;
    this.name=name;
    this.age=age;
}
public class testthis 
{
  public static void main(Static args[])
  {
    student s1 = new student(1,"Ganesh",19);
    student s2 = new student(2,"Sabu",50); 
    s1.display();
    s2.display();
    
}  
}
}