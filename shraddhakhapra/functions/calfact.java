package shraddhakhapra;

import java.util.Scanner;

public class calfact{
    public static void factorial(int number)
    {
        int fact=1;
        
        for(int i=number;i>=1;i--)
        {
            fact=fact*i;
        
        }
            System.out.println(fact);
            return;
    }
    
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int number=sc.nextInt();
            
            factorial(number);
            
    
        }
    }


