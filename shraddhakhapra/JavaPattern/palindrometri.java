public class palindrometri {
    public static void main(String args[])
    {
        int n=4;
        int m=7;
        //row
        for(int i=1;i<=n;i++){
           // System.out.print(" ");
            //column
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=m;j++){
                int sum=i+j;
                int mul=i*j;
                
                if(sum==7){
                    System.out.print("1");  
                }else if(mul==6){
                    System.out.print("2");
                }else if(mul==9){
                    System.out.print("2");
                }else if(mul==12){
                    System.out.println("2");
                }
                
            }
            System.out.println();
        }
    }
}
