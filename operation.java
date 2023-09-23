import java.io.*;//program for passing object as a paarmeter
public class operation 
{
 int data = 50;
 
 void change(operation op)
 {
   op.data=op.data+100;
 }
 public static void main(String args[])
 {
    operation op =new operation();
    System.out.println("before change"+op.data);
    op.change(op);//passing object
    System.out.println("after change"+op.data);
 }
}
