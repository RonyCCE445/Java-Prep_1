import java.util.ArrayList;
import java.util.HashSet;

public class hashset3 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(5);

        System.out.println(list);
        for(Integer num: list){
            if(seen.contains(num)){
                System.out.println(num);

                
            }

            seen.add(num);
        }

        System.out.println(seen);
    }    
}
