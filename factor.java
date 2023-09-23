import java.io.*;
import java.util.*;
public class factor {
   
    public static void main(String args[])
    {
        int num=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("entera number");
        num = obj.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }

    }
    
}
