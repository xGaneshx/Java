class employee
{
    int salary=40000;
}
public class inheritance extends employee //usage of inheritance(single)
{   
    int bonus =20000;
    public static void main(String args[])
    {
      inheritance p = new inheritance();
      System.out.println(p.salary);
      System.out.println(p.bonus);
    }
    
}
