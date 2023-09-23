public class testfrequency 
{
 public static void main(String args[])
 {
    String s="Welcome to my world how are you brother";
    int count=0;
    for(int i=0;i<=s.length()-1;i++)
    {
        if(s.charAt(i)=='t')
        {
            count++;
        }
    }
    System.out.println("Frequency of the word :"+count);
 }    
}
