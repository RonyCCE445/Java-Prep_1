class Node{
    int data;
    Node next;
     Node(int data){
        this.data = data;
        this.next = null;
        }
}

class myStack{
    Node top;

    public void push(int data){
        Node newNode =new Node(data);


        if(top == null){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
     
    }
}

public int pop(){
    if(top == null){
        System.out.println("Stack is Empty");
        return -1;
    }
    else{
        int value = top.data;
        top =top.next;
        return value;
    }

}

public int peek(){
    if(top == null){
        System.out.println("The Stack is empty");
        return -1;
    }

    else{
        return top.data;
    }
}


public void display(){
    
    if(top == null){
        System.out.println("Stack is empty");
        return;
    }

    else{
        Node temp = top;
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public boolean isEmpty(){
    return top == null;
}
}



class stackimplementation{
    public static void main(String[] args) {
        myStack stack = new myStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        

        stack.display();

        System.out.println("///////////////////");

        System.out.println(stack.peek());
        System.out.println("///////////////////");
        stack.pop();
        stack.display();
        System.out.println("///////////////////");
        
        System.out.println(stack.peek());
        System.out.println("///////////////////");
        stack.display();
        System.out.println("///////////////////");
        
        System.out.println(stack.isEmpty());


    }
}