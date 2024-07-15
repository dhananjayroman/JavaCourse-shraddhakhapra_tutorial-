import java.util.*;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
        
    }

    public void printcolor(){
        System.err.println(this.color);//this keyword hya printcolor  function la sangel ki kontya object ni call kelela ahe te
    }
}

public class First{
    public static void main(String args[])
    {
        Pen pen1=new Pen();//object create

        pen1.color="black";
        pen1.type="gel";
        
        

        Pen pen2=new Pen();//second object create
        pen2.color="blue";

        pen1.printcolor();
        pen2.printcolor();

    }

}