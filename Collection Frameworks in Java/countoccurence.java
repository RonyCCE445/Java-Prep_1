import java.util.*;
public class countoccurence {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(12);
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(2);
        list.add(23);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find: ");
        int req = sc.nextInt();

        int count = 0;
        for(int i = 0; i<list.size();i++){

            int currEl = list.get(i);
            
            if(currEl == req){
                count++;
            }
            
        }

        System.out.println("The required number: "+req+" has appeared "+count+" times in the list.");

        sc.close();
    }
}
