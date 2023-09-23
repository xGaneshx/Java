import java.util.*;
public class TestJavaCollection 
{
 public static void main(String args[])
 {
    ArrayList<String> list=new ArrayList<String>();
    list.add("ganx");
    list.add("gan");
    list.add("ganx");
    list.add("jay");
    
    System.out.println(list);
    Iterator itr=list.iterator();//using iterator
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }

 }   
}
