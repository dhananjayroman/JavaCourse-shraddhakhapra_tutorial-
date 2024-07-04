//give the 2D array input for the user and print this array for the matrix from ex row and column
import java.util.*;

public class TwoDArray{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);

    int rows=sc.nextInt();//for rows
    int cols=sc.nextInt();

    //declare 2D array
    int[][] numbers=new int[rows][cols];

    //rows
    for(int i=0;i<rows;i++)
    {   //cols
        for(int j=0;j<cols;j++)
        {
            numbers[i][j]=sc.nextInt();
        }
    }

    //output
    for(int i=0;i<rows;i++)
    {
    for(int j=0;j<cols;j++)
        {
            System.out.print(numbers[i][j] + "");
        }
        System.out.println();
    }
}
}