class TestMainThread
{
    public static void main(String args [] )
{

Thread t = Thread.currentThread ( );
System.out.println("Current Thiead"+t);
System.out.println("Name : "+ t.getName () );
System.out.println("");

t.setName("New Thread");//to set a new name to thread

System.out.println("After changing name");
System.out.println("Current Thread : " + t);
System.out.println("Name : "+ t.getName () );
System.out.println("");

System.out.println ("This thread prints first 10 numbers");
try
{
for (int i=1; i<=10;i++)
{
System.out.print(i);
System.out.print(" ");
Thread.sleep(1000);//prints slowly
}
}
catch (InterruptedException e)
{
System.out.println(e);
}
}
}