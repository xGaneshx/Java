public class TestcharAt1 
{
 public static void main(String args[])
 {
    String s="hello world how are you";
    for(int i=0;i<=s.length()-1;i++)
    {
        if(i%2!=0)
        {
            System.out.println("char at"+ i +"place is " +s.charAt(i));
        }
    }
 }   
}
