class animal
{
    String color ="white";
}
class dog extends animal
{
    String color ="black";
    public void printcolor()
    {
        System.out.println(color);
        System.out.println(super.color);//used to access parent class variable
    }
}
public class testsuper 
{
  public static void main(String args[])
  {
    dog d =new dog();
    d.printcolor();
  }  
}
