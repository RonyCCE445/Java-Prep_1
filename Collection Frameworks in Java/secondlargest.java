 import java.util.*;
public class secondlargest {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
     
        list.add(10);
        list.add(40);
        list.add(30);
        list.add(20);
       // list.add(40);

        int largest = list.get(0);
        int sec_largest = list.get(0);

        for(int i = 0; i<list.size();i++){
            int currEl= list.get(i);
            if ( currEl> largest ){
                sec_largest=largest;
                largest =currEl;
            }
            else if((currEl<largest) && (currEl>sec_largest)){
                sec_largest=currEl;

            }
        }

        System.out.println("The list is: "+ list);

        System.out.println("The secondlargest element in the list is: "+ sec_largest);


    }
}
