import java.io.*;
class table
{
    public void printtable(int n)
    {
        synchronized(this)
        {
            for(int i=1;i<=n;i++)
            {
              System.out.println(i*n);
            }
        try
        {
            Thread.sleep(500);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        }
    }
}
class thread1 extends Thread
{
    table t;
    thread1(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printtable(5);
    }
}
class thread2 extends Thread
{
    table t;
    thread2(table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printtable(10);
    }
}
class threadmul
{
    public static void main(String args[])
    {
        table obj=new table();
        thread1 t1=new thread1(obj);
        thread2 t2=new thread2(obj);
        t1.start();
        t2.start();

    }
}