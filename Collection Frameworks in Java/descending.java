import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class descending {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(10);
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(9);

        System.out.println("unsorted list is: "+ list);


        Collections.sort(list, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return b-a;
            }
        });

        System.out.println("Descendingf order: "+list);
    }
}
