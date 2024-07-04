//Q take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.

import java.util.*;

public class TwoDArrayQ3
{


public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);

    int rows=sc.nextInt();
    int cols=sc.nextInt();

    int[][] numbers=new int[rows][cols];//2D array declare

    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            numbers[i][j]=sc.nextInt();
        }
    }

    
    System.out.println("enter your no that you want to show their indices");
    int x=sc.nextInt();

    for(int i=0;i<rows;i++)
    {
        for(int j=0;j<cols;j++)
        {
            if((numbers[i][j])==x)
            {
                System.out.println("number is found at location ("+i +", "+j + ")");
            }
        }
    }
}
}