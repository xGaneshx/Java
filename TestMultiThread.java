class ThreadA extends Thread
{
public void run()
{
for (int i=1;i<=5;i++)
{
System.out.println("ThreadA i ="+(-1*i));
}
System.out.println("Exiting ThreadA");
}
}
class ThreadB extends Thread
{
public void run()
{
for (int j=1;j<=5;j++)
{
System.out.println("ThreadB j ="+(2*j));
}
System.out.println("Exiting ThreadB");
}
}
class ThreadC extends Thread
{
public void run()
{
for (int k=1;k<=5;k++)
{ 
System.out.println("ThreadC k ="+(2*(k-1))); 
} 
System.out.println("Exiting ThreadC");
}
}
class MultiThreadDemo
{
public static void main (String args [])
{
ThreadA t1 = new ThreadA();
ThreadB t2 = new ThreadB();
ThreadC t3 = new ThreadC();
t1.start();
t2.start();
t3.start();
}
}
     

