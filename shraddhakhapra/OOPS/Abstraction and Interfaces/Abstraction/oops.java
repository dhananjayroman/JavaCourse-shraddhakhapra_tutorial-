//Abstract class=
/*1)An abstract class must be declared with an abstract keyword
2)It can abstract and non-abstract methods
3)it can not be instantiated
4)it can have constructors and static method also */

package Abstraction;//abstraction is hiding the implementation details and showing only important/useful parts to the user

 abstract class Animal{
    abstract void walk();

    Animal(){//consructor
        System.out.println("you are creating a nww animal");
    }

    public void eat()//non abstract method
    {
        System.err.println("Animal eats");
    }

}

class Horse extends Animal{

    Horse(){
        System.out.println("you are create a horse");
    }
    public void walk(){
        System.out.println("horse walk on 4 legs");
    }

}

class Chicken extends Animal{
    public void walk(){
        System.err.println("chicken walk on 2 legs");
    }
}

public class oops {
    public static void main(String args[])
    {
        Horse horse=new Horse();
       // horse.walk();
       // horse.eat();

       // Chicken chicken=new Chicken();
       // chicken.walk();

       // Animal animal=new Animal();//cannot instantiate the type Animal because it is abstract only imagines
       // animal.walk();

    }
}
