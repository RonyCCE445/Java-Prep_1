import java.util.*;
public class sum {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(56);
        list.add(23);
        list.add(89);
        list.add(78);
        list.add(45);
        list.add(12);

        int sum =0;

        for(int i = 0; i<list.size(); i++){

            sum += list.get(i);
        }

        System.out.println("The List is : "+list);

        System.out.println("The Sum is: "+sum);
    }    


}
