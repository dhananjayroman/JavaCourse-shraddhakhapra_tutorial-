package shraddhakhapra;

import java.util.Scanner;


    public class function1 {
        public static int calsum(int a, int b){
            int sum=a+b;
            return sum;
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
             int a=sc.nextInt();
             int b=sc.nextInt();
    
             int result=calsum(a, b);
             System.out.println("sum of 2 no is:"+result);

        }
    }

