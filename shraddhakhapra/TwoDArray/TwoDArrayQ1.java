//print the transpose of matrix
import java.util.*;
public class TwoDArrayQ1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt();
        int cols=sc.nextInt();

        int maxtrix[][]=new int[row][cols];
        //row
        for(int i=0;i<row;i++){
            //column
            for(int j=0;j<cols;j++){
                maxtrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("transpose of matrix is:");

        //transpose
        for(int j=0;j<cols;j++)
        {
            for(int i=0;i<row;i++)
            {
                System.out.print(maxtrix[i][j]+" ");

            }
            System.out.println();
        }
    }
}