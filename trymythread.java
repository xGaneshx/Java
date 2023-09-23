import java.io.*;
import java.util.*;
class mythread extends Thread
{
public void run()
{
    int a=5;
    int b=3;
    int c=a+b;
    System.out.println("Sum :"+c);
}
}
class mythread1 extends Thread
{
    public void run()
    {
        int d=4;
        int e=10;
        int f=d*e;
        System.out.println("Product :"+f);
    }
}
class trymythread
{
    public static void main(String args[])
    {
        mythread t = new mythread();
        mythread1 t1 = new mythread1();
        t.start();
        t1.start();
    }
}