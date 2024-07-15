package Encapsulation;//data and functions are combine in one unit ,datahiding=it is the process of protecting members of class from unintended changes


class Account{
    public String name;//public modifier use to this info are access in all classes 
    protected String email;//protected modifier use to this info are access in this classes and another file of subclasses
    private String password;//private modifier can access info only in that class not out of the class, 

    //getters and setters=private info access through this 2 funcions

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password=pass;
    }
}




public class Bank {
    
    public static void main(String args[]){
        Account account1=new Account();
        account1.name="IDBI";
        account1.email="dhanu@123gmail.com";
        //account1.pass="abcd"//not visible

        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
