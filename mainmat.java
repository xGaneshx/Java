import java.io.*;
import java.util.*;
class la{

void large(){
System.out.println("ENter row");
Scanner sc=new Scanner(System.in);
int r = sc.nextInt();
System.out.println("ENter column :");
int c= sc.nextInt();
int a[][]=new int[10][10];
System.out.println("Enter a mat");
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        a[i][j]=sc.nextInt();
    }
}
int max= a[0][0];
for(int i=0;i<r;i++)
{
    for(int j=0;j<c;j++)
    {
        if(max<a[i][j]){
        max=a[i][j];
        break;
    }
    }
}
System.out.println("MAx"+max);
}

}
class sm{

void small(){
    System.out.println("ENter row");
    Scanner sc=new Scanner(System.in);
    int r = sc.nextInt();
    System.out.println("ENter c");
    int c= sc.nextInt();
    int a[][]=new int[10][10];
    System.out.println("Enter a mat");
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    int min= a[0][0];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
            if(min>a[i][j]){
            min=a[i][j];
            break;
        }
        }
    }
    System.out.println("MAx"+min);
}
    
    }
    class mainmat{
        public static void main (String args[])
        {
            la l=new la();
            sm a=new sm();
            l.large();
            a.small();
        }
    }