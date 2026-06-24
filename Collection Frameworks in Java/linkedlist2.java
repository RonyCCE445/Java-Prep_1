import java.util.LinkedList;

public class linkedlist2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
System.out.println("Initial List: "+list);

        list.addFirst(0);
        list.addLast(6);
        list.contains(50);
        list.set(2,100);

        list.removeFirst();
        list.removeLast();

        System.out.println("index of 100: "+list.get(2));

        System.out.println("Final List: "+list);
        System.out.println("Size of the list: "+list.size());


    }
}
