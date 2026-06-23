import java.util.ArrayList;


public class countodd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(9);


        int count = 0;
        for(int i = 0; i<list.size();i++){
           
            if(list.get(i)%2 != 0){
                count++;
                System.out.println(list.get(i)); 
            }
        }
        System.out.println("Total : "+count);
    }    
}
