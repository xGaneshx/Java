import java.io.*;
import java.util.*;
    public class arm {

        public static void main(String[] args) {
    
            int number = 0, originalNumber, remainder, result = 0;
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter an integer");
            number = obj.nextInt();
            originalNumber = number;
    
            while (originalNumber != 0)
            {
                remainder = originalNumber % 10;
                result  = result + remainder*remainder*remainder;
                originalNumber = originalNumber/10;
            }
    
            if(result == number)
            {
                System.out.println(number + " is an Armstrong number.");
            }
                else
             {
                System.out.println(number + " is not an Armstrong number.");
             }        
            }
    
}
