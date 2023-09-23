class vehicle
{
void run()
{
    System.out.println("vehicle is running");
}
}


class bike extends vehicle 
{
  void run()
  {
    System.out.println("bike is good");
  }
  public static void main(String args[])
  {
    bike b=new bike();
    b.run();
  }  
}
