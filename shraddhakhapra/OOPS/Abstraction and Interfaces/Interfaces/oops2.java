package Abstraction;
//Interfaces
/*1)all the fields in interfaces are public, static and final by default
 2)all methods are public and abstract by default
 3)a class that implements an interface must implement all the methods declare in the interface.
 4)interface support the functionality of multiple inheritance
 */

 interface Dance{
    public void canDance();
 }

 interface Fight{
    public void canFight();
 }
 
 
 class Actor implements Dance,Fight{
    String name;
    Actor(String n)
    {
        name=n;
    }
    public void canDance(){
        System.out.println(name+" canDance");
    }
    
    public void canFight(){
        System.out.println(name+" canFight");
    }
 }

 public class oops2 {
    public static void main(String args[]){
        Actor actor=new Actor("dhananjay");
        actor.canDance();
        actor.canFight();

        //Aeroplane aeroplane1=new Aeroplane();
       
    }
}
