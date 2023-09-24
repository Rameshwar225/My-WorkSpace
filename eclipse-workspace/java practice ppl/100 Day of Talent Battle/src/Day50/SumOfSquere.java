package Day50;

import java.util.Scanner;
public class SumOfSquere
{
    public static int SquareSum(int a[],int size) 
    {
        int sum=0;
        int square=0;
        //for loop to square and sum of elements
        for(int i=0;i<size;i++)
        {
            square=a[i]*a[i];
            sum=sum+square;
        }
        //return the sum variable;
        return sum;
    }

    public static void main(String[] args) 
    {
        int j=0;
        //create array 
        int[] arr=new int[40];
        //declare the scanner class
        Scanner sc=new Scanner(System.in);
        //take size of an array
        System.out.println("enter size");
        int size=sc.nextInt();
         //take array element
        System.out.println("enter element");
        for(int i=0;i<size;i++)
              arr[i]=sc.nextInt();
        //print sum from calling the fuction SquareSum
        System.out.print("square sum of element "+SquareSum(arr,size));
     }
}