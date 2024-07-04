//take an array of numbers as input and check if it is array sorted in ascending ordeer eg:{1,2,4,7} is sorted in ascendgin order.

import java.util.*;

public class ArrayQ3{


public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int size=sc.nextInt();
    int numbers[]=new int[size];


//input
for(int i=0;i<size;i++){
    numbers[i]=sc.nextInt();
}

boolean isAscending=true;

for(int i=0;i<numbers.length-1;i++){
    if(numbers[i]>numbers[i+1]){
        isAscending=false;
    }
}

if(isAscending){
    System.out.println("the array is sorted in ascendig order");
}else{
    System.out.println("the array does not sorted in ascending order");
}

}
}