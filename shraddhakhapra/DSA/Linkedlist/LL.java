
 class LL
 {
    private int size;
    
    LL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;
      
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
           
        }
    }

    //add-first node
    Node head;
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head == null){
        head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add-last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
            Node currNode=head;
            while(currNode.next != null)
            {
                currNode=currNode.next;
            }
            
            currNode.next=newNode;
        }

        //delete-first node
        public void delFirst(){
           
            if(head==null){
                System.out.println("the list is empty");
                return;
            }
         size--;
        head=head.next;
    }

        public void delLast(){
            if(head==null){
                System.out.println("the list is empty");
                return;
        }
         size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondlast=head;
        Node lastNode= head.next;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }

    //print List
    public void printList(){
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode != null)
        {   
            System.out.print(currNode.data + "--->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    
    public int getSize(){
        return  size;
    }

    public static void main(String main[])
    {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
       
        list.printList();

        list.addLast("list");
        list.printList();

        list.delFirst();//deletefirsst
        list.printList();

        list.delLast();
        list.printList();//deletelast

        System.out.println(list.getSize());
    }
}