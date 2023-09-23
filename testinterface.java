interface wildanimal
{
    public void animalsound();
    public void color();
}
class pig implements wildanimal
{
 public void animalsound()
 {
    System.out.println("Wee Wee....");
 }
 public void color()
 {
    System.out.println("color of pig is pink");
 }
}
public class testinterface 
{
  public static void main(String args[])
  {
    pig p=new pig();
    p.animalsound();
    p.color();
  }  
}
