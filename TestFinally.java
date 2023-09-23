class TestFinally{
  public static void main(String args[])
  {
  
  try
  {
  int data=25/2;
  System.out.println(data);
  }catch(NullPointerException e){System.out.println(e);}
  
  finally
  {
    System.out.println("finally block is always executed"); 
  }
  System.out.println("rest of the code...");//rest of the code not displayed cause there is an exception
  }
  }