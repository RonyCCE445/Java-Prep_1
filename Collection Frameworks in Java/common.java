import java.util.ArrayList;

public class common {
    public static void main(String[] args) {
        ArrayList <Integer> l1 = new ArrayList<>();
        ArrayList <Integer> l2 = new ArrayList<>();

        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        l2.add(3);
        l2.add(7);
        l2.add(5);
        l2.add(2);


        
            for(int j = 0; j< l2.size();j++){

                if(l1.contains(l2.get(j))){
                    System.out.println(l2.get(j)); 
                }
            
        }
        
    }    
}
