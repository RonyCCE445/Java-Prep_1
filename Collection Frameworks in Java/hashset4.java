import java.util.HashSet;

public class hashset4 {
    public static void main(String[] args) {
        HashSet <Integer> set1 = new HashSet<>();
        HashSet <Integer> set2 = new HashSet<>();
        

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);


        HashSet <Integer> union = new HashSet<>(set1);
        HashSet <Integer> intersection = new HashSet<>(set1);
        HashSet <Integer> difference = new HashSet<>(set1);

        
        System.out.println("Set 1 :" + set1);
        System.out.println("\nSet 2 : "+set2);
        union.addAll(set2);
        System.out.println("\nUnion: "+union);
        intersection.retainAll(set2);
        System.out.println("Intersection: "+intersection);
        difference.removeAll(set2);
        System.out.println("Difference: "+difference);

        
    }
}
