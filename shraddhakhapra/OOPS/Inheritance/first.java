package Inheritance;
//kontya pan eka class chi property,methods jar dusrrya class la havi asel tr tya process la inheritance mhntat tyasathi extends keyword lagto
//inheritance mule reusability vadhate
//4 types=i)single level ii)multilevel iii)hirarchical iv)Hybrid

class Shape{
    public void area(){
        System.err.println("display area");
    }
}

class Triangle extends Shape{//signle level
    public void area(int l, int b)
    {
        System.out.println(1/2*l*b);
    }
}

class Equilateral extends Triangle{//multilavel
    public void area(int l, int b)
    {
        System.out.println(1/2*l*b);
    }
}

class Circle extends Shape{//hirarchical=one base class and multiple dirived classes
    public void area(int r)
    {
        System.out.println((3.14)*r*r);
    }

}
public class first {
    public static void main (String args[])
    {
        
    }
    
}
