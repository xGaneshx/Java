import java.io.*;
abstract class animal
{
    public abstract void animalsound();
    public void sleep()
    {
        System.out.println("zzz");
    }
}
class dog extends animal//can only be used for inheritance
{
  public void animalsound()//abstarct method defenition is given here
  {
    System.out.println("bark");

  }

}
class testabstract 
{
    public static void main(String args[])
    {
        dog d=new dog();
        d.animalsound();
        d.sleep();
    }
    
}
