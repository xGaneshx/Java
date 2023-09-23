import java.util.Scanner;

public class TestThrow 
{ 
  static void vote(int age)
  {
    if(age<18)
    throw new ArithmeticException("GET OUT!!!!!!!");
    else
    System.out.println("Welcome for the vote");
  }
  public static void main(String args[])
  {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter age of the person");
    int age = obj.nextInt();
    vote(age);
  }

    
}
