interface firstclass
{
    public void first();
}
interface secondclass
{
    public void second();
}
class print implements firstclass,secondclass //multiple inheritance
{
  public void first()
  {
    System.out.println("first interface");
  }
  public void second()
  {
    System.out.println("second interface");
  }
}

class multipleinheritance 
{
  public static void main(String args[])
  {
    print p=new print();
    p.first();
    p.second();
  }  
}
