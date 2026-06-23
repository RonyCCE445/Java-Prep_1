import java.util.ArrayList;

public class merge {
    public static void main(String[] args) {
        ArrayList <Integer> a1 = new ArrayList<>();
        ArrayList <Integer> a2 = new ArrayList<>();
     
            a1.add(1);
            a1.add(2);
            a1.add(3);
            a1.add(4);

            a2.add(5);
            a2.add(6);
            a2.add(7);
            a2.add(8);

        System.out.println("The First List is: "+ a1 );
        System.out.println("The Second List is: "+a2);

        // for(int i = 0;i<a2.size();i++){          // This one is the manual method and the later one used in this prpgram is the built-in mehtod.
        //         a1.add(a2.get(i));
        // }
        //System.out.println(a1);
        
            a1.addAll(a2);
        System.out.println("Merged Array : "+a1);
    }    
}
