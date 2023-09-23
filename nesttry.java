public class nesttry
{ 
    public static void main(String args[])
    {
  try
  {
    System.out.println("going to divide");
    int a=30/0;
  }
  catch(ArithmeticException e)
  {
    System.out.println(e);
  }
  try
  {
    int arr[]=new int[5];
    arr[50]=1;
  }catch(ArrayIndexOutOfBoundsException e)
  {
    System.out.println(e);
  }
}catch(Exception e)
{
    System.out.print("handeled");
}
}
System.out.println("normal flow of program");
