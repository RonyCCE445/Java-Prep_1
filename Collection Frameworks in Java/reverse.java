import java.util.*;

public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(56);
        list.add(89);
        list.add(48);
        list.add(78);
        list.add(23);
        System.out.println("List is: ");
        System.out.println(list);
            System.out.println("reverse List is: ");
        for(int i = list.size()-1;i>=0;i-- ){
            System.out.println(list.get(i));


        }
    }    
}
