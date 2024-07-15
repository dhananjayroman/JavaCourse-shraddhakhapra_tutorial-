package class_object;
//constructor program 1)parameterless 2)parameterlised


 class Student{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student()
    {
        //parameter less constructor
        System.out.println("constructor invoked");
    }

    Student(String name, int age)//parameterlised constructor
    {
        this.name=name;
        this.age=age;
    }
}

public class Second{
    public static void main(String args[]){
    //Student s1=new Student();//parameterless

    Student s1=new Student("dhanu",22);//parameterrised

    //s1.name="dhanu";
    //s1.age=22;
    s1.printInfo();
}

}
    


