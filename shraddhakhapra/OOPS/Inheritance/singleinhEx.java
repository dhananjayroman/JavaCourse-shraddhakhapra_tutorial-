package Abstraction;


import java.util.*;

class student{
    int id;
    String name;
    
    void getStudent(){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter studet Id");
        id=sc.nextInt();
        System.out.println("enter student name");
        name=sc.next();
    }

    void putStudent(){
        System.out.println("ID:"+id);
        System.out.println("NAME:"+name);
    }
}

class Test extends student{
    int marks;
    void getTest(){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter student marks");
        
         marks=sc.nextInt();
    }

    void putTest(){
        System.out.println("Marks:"+marks);
    }
}
public class singleinhEx {
    public static void main(String args[])
    {
        Test t1=new Test();
        t1.getStudent();
        t1.getTest();
        t1.putStudent();
        t1.putTest();
    }
}
