public class mythread extends Thread 
{
    public void run()
    {
    System.out.println("Current thread name"+Thread.currentThread().getName());
    System.out.println("run() method is executed");
    }
}
class TestThread
{
    public static void main(String args[])
    {
        mythread t=new mythread();
        t.start();
    }
}
