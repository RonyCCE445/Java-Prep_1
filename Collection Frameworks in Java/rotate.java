import java.util.ArrayList;

public class rotate {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int last = list.get(list.size()-1);
        System.out.println(list);

        for(int i = list.size()-1;i>0;i--){
            list.set(i,list.get(i-1));


        }

        list.set(0, last);

        System.out.println(list);
    }    
}
