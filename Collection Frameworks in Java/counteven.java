import java.util.ArrayList;

public class counteven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(55);
        list.add(2);
        list.add(66);

        // for(int i=0; i<100; i++){
        //     list.add(i);
        // }

        int count = 0;

        for(int i=0; i<list.size();i++){
            if(list.get(i)%2==0){
                count++;
            }

        }

        System.out.println("Number of even numbers are: "+count);
    }    
}
