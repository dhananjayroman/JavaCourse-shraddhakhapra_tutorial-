import java.util.*;
public class LLmain {

    public static void main(String args[]){
        LinkedList<String> list=new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("list");
        System.out.println(list);

        list.addFirst("this");
        System.out.println(list);

        System.out.println(list.size());//display size of the list

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ "-->");
        }
        System.out.println("null");

        list.removeFirst();//remove first
        System.out.println(list);

        list.removeLast();
    
        System.out.println(list);

    }
}
