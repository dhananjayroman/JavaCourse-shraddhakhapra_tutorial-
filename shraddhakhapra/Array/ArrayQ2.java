//find the maximum and minimum numbers in an array of integers
import java.util.*;

public class ArrayQ2 {
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);

    int size=sc.nextInt();
    int numbers[]=new int[size];

    //input
    for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
    }

    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;

    for(int i=0;i<numbers.length;i++)
    {
        if(numbers[i]<min){
            min=numbers[i];
        }
        if(numbers[i]>max){
            max=numbers[i];
        }

    }
    System.out.println("largest number is:"+max);
    System.out.println("smallest number is:"+min);



}
}


