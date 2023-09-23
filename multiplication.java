import java.io.*;
import java.util.*;
public class multiplication 
{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the order of -m1 :");
    int m1 = sc.nextInt();
    System.out.println("Enter the order of -n1 :");
    int n1 = sc.nextInt();
    System.out.println("Enter the order of -m2 :");
    int m2 = sc.nextInt();
    System.out.println("Enter the order of -n2 :");
    int n2 = sc.nextInt();
    if(n1!=m2)
    {
        System.out.println("Matrix multiplication is not possible");
        return;
    }
    int A[][]=new int[m1][n1];
    int B[][]=new int[m2][n2];
    int C[][]=new int[m1][n2];
    System.out.println("enter the matrix A");
    for(int i=0;i<m1;i++)
    {
        for(int j=0;j<n1;j++)
        {
          A[i][j]=sc.nextInt();
        }
    }
    System.out.println("Enter the matrix B");
    for(int i=0;i<m2;i++)
    {
        for(int j=0;j<n2;j++)
        {
            B[i][j]=sc.nextInt();
        }
    }
    
    for(int i=0;i<m1;i++)
    {
        for(int j=0;j<n2;j++)
        {
            C[i][j]=0;
            for(int k=0;k<n1;k++)
            {
                C[i][j]=C[i][j]+A[i][k]*B[k][j];
            }  
        }
    }
    for(int i=0;i<m1;i++)
    {
        for(int j=0;j<n2;j++)
        {
            System.out.println("C[i][j] :"+C[i][j]);
        }
    }
 }   
}
