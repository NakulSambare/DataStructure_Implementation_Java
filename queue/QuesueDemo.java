
class Queue {
    public static final int max_size = 1000;
    public int front;
    public int rear;
    public int[] queueArray;
    public int size;

   Queue(){
    front=0;
    rear=-1;
    queueArray = new int[max_size];
    size=0;
   }

   public boolean isFull(){
        return size==max_size-1;
   }
   public boolean isEmpty(){
       return size ==0;
   }

   public void enqueue(int data){
       if(!isFull()){
        rear= (rear+1)%max_size;
        queueArray[rear]=data;
        size++;
       }
       else{
        System.out.println("Queue is full");
    
       }
   }
public int dequeue(){
    if(!isEmpty()){
        int data = queueArray[front];
        front=(front+1)%max_size;
        size--;
        return data;
    }
    else{
         System.out.println("Queue is empty");
         return -1;
    }
}

}

public class QuesueDemo {
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(1);
         q.enqueue(2);
          q.enqueue(3);
           q.enqueue(4);

           System.out.println(q.dequeue());
           System.out.println(q.dequeue());
    }
}
