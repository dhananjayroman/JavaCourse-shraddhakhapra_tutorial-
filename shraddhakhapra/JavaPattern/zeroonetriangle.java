public class zeroonetriangle {
    public static void main(String args[]){
        int n=4;
       
        
        //row
        for(int r=1;r<=n;r++){
            //System.out.print(number2);
        
            //column
            for(int c=1;c<=r;c++)
            {
                int sum=r+c;
                if(sum%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            
        
            System.out.println();
        }
        }
    
}
