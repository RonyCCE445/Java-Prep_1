import java.util.ArrayList;

public class findmin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(55);
        list.add(663);
        list.add(2);
        list.add(1236);
        list.add(6);

        int min = list.get(0);

        for( int i = 0; i<list.size();i++){
            int currel = list.get(i);

            if(currel<min){
                min = currel;
            }
        }
        System.out.println(list);
        System.out.println("The minimum element in the list is : "+min);

        }
   
   
    }   
