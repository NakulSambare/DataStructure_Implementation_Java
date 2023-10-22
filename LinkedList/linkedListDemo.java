class Node{
    String data;
    Node next;
    Node(String d){
        data=d;
    }
}

class LinkedList{
    Node head = null;
    LinkedList(){
        head=null;
    }
    public void append(String data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next !=null){
            current=current.next;
        }
        current.next=newNode;
    }
    
    public void display(){
        Node current= head;
        while(current != null){
        System.out.print(current.data+"=> ");
        current=current.next;
        }
    }
}
class linkedListDemo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        LinkedList l = new LinkedList();
        l.append("1");
        l.append("2");
        l.append("3");
        
        l.display();
       
    }
}