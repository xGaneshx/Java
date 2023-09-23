class outer
{
    int x=10;
    class inner
    {
      int y=5;
    }
}
public class outerinner //usage of inner and outer class
{
  public static void main(String args[])
  {
    outer outer1 = new outer();
    outer.inner inner1 = outer1.new inner();
    System.out.println(outer1.x + inner1.y);
  }  
}
