class animal
{
    animal()
    {
        System.out.println("animal is eating");
    }

}
class dog extends animal
{
    dog()
    {
        super();//used to call a constructor can also be used to call a method of the parent class
        System.out.println("dog id barking");
    }
}
class testsuper3 
{
  public static void main(String args[])
  {
    dog d=new dog();
   
  }  
}