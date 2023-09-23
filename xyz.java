import java.io.*;
class mythread extends Thread 
{
public void run()
{
    System.out.println("Name of the current thread :"+Thread.currentThread().getName());
}
}
class xyz
{
    public static void main(String args[])
    {
    mythread t = new mythread();
    t.start();
    }
}
 