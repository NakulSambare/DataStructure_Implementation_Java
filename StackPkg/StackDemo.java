





 class Stack1{
    public static final  int max_size= 1000;
    public int[] stackArray;
    int top;
    Stack1(){
        stackArray = new int[max_size];
        int top=-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top == max_size-1;
    }

    public void push(int data){
        if(!isFull()){
            stackArray[++top]=data;

        }
        else{
            System.out.println("Array is full");
        }
    }

    public int pop(){
        if(!isEmpty()){
            return stackArray[top--];
        }
        else{
            System.out.println("Array is empty");
            return -1;
        }
    }

    public int peek(){
        return stackArray[top];
    }


}public class StackDemo {
    public static void main(String args[]){
        Stack1 s = new Stack1();
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);
        System.out.println(s.pop());
        System.out.println(s.peek());
        
    }
}
