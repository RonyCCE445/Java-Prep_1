class Node{
    int data;
    Node next;
     Node(int data){
        this.data = data;
        this.next = null;
        }
}

class MyLinkedList{
    Node head = null;


    public void myadd(int data){
        Node newNode =new Node(data);
        Node temp = head;

        if(head == null){
            head = newNode;
        }
        else{
            while(temp.next !=null){
                temp = temp.next;
                
            }
            temp.next = newNode;
        }
    }
    public void myDisplay(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void mysearch(int data){
        Node temp = head;
        boolean found = false;
        while(temp!= null){
            if(data==temp.data){
                System.out.println("Found!!");
                
                return;
            }
            else{
                found = false;
            }
                temp =temp.next;
        }

            System.out.println("Not Found!!");
        
    }

    public void mydelete(int data){
        Node current = head;
        Node previous = null;
        if(head ==null){
            System.out.println("The List is empty");
            return;
        }
        else if(head.data == data){
            head = head.next;
            return;
        }
        else{

            previous = current;
            current = current.next;
            while(current!= null){
                if(current.data == data){
                    previous.next = current.next;
                    return;
                   
                }
                previous = current;
                current = current.next;
            }
            System.out.println("Not Found!!");

        }
            

            

        }


    public int mysize(){
        int count = 0;

        Node temp = head;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
    }
}

public class linkedlist3 {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        System.out.println("Adding elements...");
        list.myadd(10);
        list.myadd(20);
        list.myadd(30);
        list.myadd(40);
        list.myadd(50);

        System.out.println("\nDisplaying List:");
        list.myDisplay();

        System.out.println("\nSize of List:");
        System.out.println(list.mysize());

        System.out.println("\nSearching for 30:");
        list.mysearch(30);

        System.out.println("\nSearching for 100:");
        list.mysearch(100);

        System.out.println("\nDeleting 30:");
        list.mydelete(30);

        System.out.println("\nDisplaying List After Deletion:");
        list.myDisplay();

        System.out.println("\nSize After Deletion:");
        System.out.println(list.mysize());

        System.out.println("\nDeleting Head Node (10):");
        list.mydelete(10);

        System.out.println("\nDisplaying List:");
        list.myDisplay();

        System.out.println("\nDeleting 999:");
        list.mydelete(999);

    }
}
