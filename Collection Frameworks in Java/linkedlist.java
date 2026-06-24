import java.util.Arrays;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(0);
        list.addLast(5);

        System.out.println("Full List: "+list);

        System.out.println("Element at index 3 is: "+list.get(3));

        list.remove(4);
        System.out.println("After removing: "+list);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat","Dog", "Lion"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("Cat","Dog"));
        System.out.println("Animals: "+animals);
        System.out.println("Animals to remove : "+animalsToRemove);

        animals.removeAll(animalsToRemove);

        System.out.println("After using removeall and feeding animalstoRemove to the animals: "+animals);

        
    
    }
}
