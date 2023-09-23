class vehicle
{
   protected String brand = "Ford";
    public void honk()
    {
        System.out.println("trrrr");
    }
}
public class car1 extends vehicle //inheritance.
{
  private String model ="mustang";
  public static void main(String args[])
  {
    car1 car = new car1();
    car.honk();
    System.out.println(car.brand+" "+car.model);
    
  }
}
